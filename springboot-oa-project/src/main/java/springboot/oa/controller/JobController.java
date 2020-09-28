package springboot.oa.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import springboot.oa.domain.TbFbf;
import springboot.oa.domain.TbJob;
import springboot.oa.service.FbfService;
import springboot.oa.service.JobService;
import springboot.oa.vo.PageBean;

@Controller
public class JobController {
	
	@Autowired
	private JobService jobService;


	@RequestMapping("/job/selectJob")
	public String selectJob() {
		return "job/job";
	}
	
	@RequestMapping("/bjson")
	public @ResponseBody PageBean<TbJob> showAllDept(Integer pageNumber, Integer pageSize, String qzlqrxm) {

		PageBean<TbJob> pageBean = jobService.showDept(pageNumber, pageSize, qzlqrxm);
		System.out.println(pageBean);

		return pageBean;

	}
	
	@RequestMapping("/job/addJob")
	public String addDept(Integer flag, TbJob job, HttpServletResponse response) {
		if (flag == 1) {
			return "job/showAddJob";

		} else {
			if (jobService.addJob(job)) {
				try {
					response.getWriter().print("success");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					response.getWriter().print("error");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return null;
	}

	@RequestMapping("/job/removeJob")
	public String deleteDept(Integer flag, Integer id, @RequestParam(required = false, value = "ids[]") Integer[] ids,
			HttpServletResponse response) {
		System.out.println("delete........dept");
		System.out.println(flag);
		System.out.println(id);
		System.out.println(ids);

		PrintWriter writer;
		try {
			writer = response.getWriter();

			boolean result = false;
			if (flag == 1) {
				result = jobService.deleteById(id);
				return "job/job";

			} else {
				result = jobService.deleteBybatch(ids);

			}
			if (result) {
				writer.print("success");
			} else {
				writer.print("error");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
//	/dept/updateDept

	@RequestMapping("/job/updateJob")
	public String udpateDept(Integer flag, Integer id, TbJob job, Model model, HttpServletResponse response){
		try {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter writer = response.getWriter();

			if (flag == 1) {// 跳转到修改信息页面
				model.addAttribute("job", jobService.findJobById(id));
				return "job/showUpdateJob";
			} else {
			
				if (jobService.udpateJob(job)) {
					writer.print("success");
				} else {
					writer.print("error");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
