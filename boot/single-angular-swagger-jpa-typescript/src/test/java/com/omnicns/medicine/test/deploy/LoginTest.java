//package com.omnicns.medicine.test.deploy;
//
//import com.omnicns.medicine.MedicineApplication;
//import com.omnicns.medicine.config.security.WebSecurityConfigurerAdapter;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.mock.web.MockHttpSession;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.context.WebApplicationContext;
//
//import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.*;
//
//import javax.servlet.Filter;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
//
//@RunWith(SpringRunner.class)
////@SpringBootTest(classes = Omnifit2CmsApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@SpringBootTest(classes = MedicineApplication.class)
//@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
//@ActiveProfiles("local")
//@Transactional
////@WebAppConfiguration
//public class LoginTest {
//
//	@Autowired
//	private WebApplicationContext wac;
//	private MockMvc mockMvc;
////	@Autowired
////	private FilterChainProxy filterChainProxy;
//	@Autowired
//	private Filter springSecurityFilterChain;
//	private MockHttpSession session;
//
//	@Before
//	public void initMockMvc() throws Exception {
//		mockMvc = webAppContextSetup(wac)
//				.dispatchOptions(true)
//				.addFilters(springSecurityFilterChain)
////				.apply(SecurityMockMvcConfigurers.springSecurity())
//				.build();
//
//		this.session = (MockHttpSession)mockMvc.perform(formLogin(WebSecurityConfigurerAdapter.LOGIN_PROCESSING_URL)
//				.user("cww")
//				.password("cwcw"))
//				.andExpect(status().is3xxRedirection())
//				.andReturn().getRequest().getSession();
//	}
//
//	@Test
//	public void start() throws Exception {
//
//
//
//	}
//
//
//	@After
//	public void after() throws Exception {
//		//mockMvc.perform(logout(WebSecurityConfigurerAdapter.LOGOUT_URL)).andExpect(status().is3xxRedirection());
//	}
//
//}
