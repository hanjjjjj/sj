package com.its.member.controller;

import com.its.member.dto.MemberDTO;
import com.its.member.service.MemberService;
import jdk.jfr.MemoryAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberService; //서비스로 넘기기위해 주입을 받는다.


    @GetMapping("/")    // 처음 실행했을때, 처음 켰을때 // 주소표시줄에 표시 해줘
    public String index(){
        return "index";
    }

    @GetMapping("/save-form")
    public String saveForm() {
        return "save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute MemberDTO memberDTO){
        boolean saveResult = memberService.save(memberDTO);
        if(saveResult){
            System.out.println("저장성공");
            return "login";
        }else{
            System.out.println("저장실패");
            return "saveFail";
        }
    }

    @GetMapping("/login-form")
    public String loginForm(){
        return "login";
    }
    @PostMapping("/login")
    public String Login(@ModelAttribute MemberDTO memberDTO, Model model, HttpSession session){
        MemberDTO loginMember = memberService.login(memberDTO);
        // 세션(session)
        if(loginMember != null){
            model.addAttribute("loginMember", loginMember);
            session.setAttribute("loginMemberId",loginMember.getMemberId());
            session.setAttribute("loginid",loginMember.getId());
            System.out.println("로그인실패");
            return "login";
        }else{
            System.out.println("로그인 성공");
            return "main";
        }
    }

    @GetMapping("/findAll")
    public String findAll(Model model) {
        List<MemberDTO> memberList = memberService.findAll();
        model.addAttribute("memberList", memberList);
        return "list";
    }

    @GetMapping("/detaild")
    public String findById(@RequestParam("id") long id, Model model){
        System.out.print("id="+ id);
        MemberDTO memberDTO = memberService.findById(id);
        model.addAttribute("member",memberDTO);
        return "detail";
    }

}
