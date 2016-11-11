package com.manageplantfrom.action;


import java.util.ArrayList;
import java.util.List;

import com.manageplantfrom.base.BaseAction;
import com.manageplantfrom.entity.PHCSMP_BelongingS;
import com.manageplantfrom.entity.PHCSMP_Personal_Check;
import com.manageplantfrom.entity.PHCSMP_Suspect;
import com.manageplantfrom.service.BelongingInforService;
import com.manageplantfrom.service.PersonalCheckService;
import com.manageplantfrom.service.SuspectService;
import com.manageplantfrom.serviceImple.BelongingInforServiceImple;
import com.manageplantfrom.serviceImple.PersonalCheckServiceImple;
import com.manageplantfrom.serviceImple.SuspectServiceImple;
import com.manageplantfrom.utils.CompleteCheck;

/**
 * 人身检查记录信息
 * @author wuhaifei
 * @d2016年8月14日
 */
public class PHCSMP_Personal_Check_Action extends BaseAction<PHCSMP_Personal_Check> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//用于多条记录的提取，一条人身检查记录对应多个随身物品登记记录
	private List<PHCSMP_BelongingS> belong = new ArrayList<PHCSMP_BelongingS>();
	//人身检查的service
	private PersonalCheckService service = new PersonalCheckServiceImple();
	//随身物品登记
	private BelongingInforService belongingInforService = new BelongingInforServiceImple();
	
	/**
	 * 添加用户人身检查信息
	 * @return
	 * @throws Exception
	 */
	public String addCheckPersonInfor() throws Exception{
		
		/*通过反射加载类的信息*/
		System.out.println("PHCSMP_Personal_Check_Action：addCheckPersonInfor\n\n");
		System.out.println("单条信息："+model.toString());
		List<PHCSMP_BelongingS> belongs = this.getBelong();
		for (PHCSMP_BelongingS belong : belongs) {
			belong.setSuspect_ID(model.getSuspect_ID());//设置档案编号
			belong.setRoom_ID(model.getRoom_ID());//设置登记信息的房间编号
		}
		service.saveCheckPersonInfor(model);//保存人身检查记录
		belongingInforService.saveBelongInforList(belongs);//批量保存随身物品信息
//		Class<?> c = Class.forName(PHCSMP_Personal_Check.class.getName());
//		
//		int count = CompleteCheck.IsEqualsNull(model, c);
//		int fieldsNumber = CompleteCheck.getFieldsNumber(model, c);
//		
//		model.setFill_record(fieldsNumber-count-3);//设置已填写的字段数
//		model.setTotal_record(fieldsNumber-3);//设置应填写的字段
//		System.out.println("未填写的字段："+count);
//		System.out.println("总字段："+fieldsNumber);
//		
//		System.out.println("addCheckPersonInfor");
//		service.saveCheckPersonInfor(model);
		return "addCheckPersonInfor";
	}
	
	/**
	 * 加载上一个房间的嫌疑人的信息
	 * @return
	 */
	public String loadInfor(){
		System.out.println("loadInfor");
//		SuspectService suspectService = new SuspectServiceImple();
//		int roomId = 1;
//		System.out.println("wuhaifei");
//		PHCSMP_Suspect SuspectInfor =  suspectService.findInfroByActiveCode(roomId);
//		//将信息从数据库查找到之后，存入session
//		request.setAttribute("SuspectInfor", SuspectInfor);
		
		return "loadInfor";
	}
	//返回修改人身检查信息
	public String updateInfor(){
		System.out.println("档案编号："+request.getParameter("Suspect_ID"));
		System.out.println("updateInfor：修改人身检查信息！");
		return "updateInfor";
	}
	public List<PHCSMP_BelongingS> getBelong() {
		return belong;
	}

	public void setBelong(List<PHCSMP_BelongingS> belongs) {
		this.belong = belongs;
	}
}
