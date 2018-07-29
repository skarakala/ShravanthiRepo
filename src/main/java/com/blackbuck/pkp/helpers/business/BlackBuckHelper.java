package com.blackbuck.pkp.helpers.business;

import com.blackbuck.pkp.blackbuck.screens.OrderModificationScreen;
import com.blackbuck.pkp.blackbuck.screens.CreatedOrdersScreen;
import com.blackbuck.pkp.blackbuck.screens.OrderFormScreen;
import com.blackbuck.pkp.blackbuck.screens.LandingScreen;
import com.blackbuck.pkp.blackbuck.screens.SignInScreen;
import com.blackbuck.pkp.utils.TimeUtils;

public class BlackBuckHelper {
	
	
	public void creatOrderAndModify() {
		
		//LOGIN
		SignInScreen signInScreen = new SignInScreen();
		signInScreen.openBlackBuckSite();
		signInScreen.enterUserName();
		signInScreen.enterPassword();
		signInScreen.clickSignIn();
		
		//ORDER CREATION
		LandingScreen landingScreen = new LandingScreen();
		landingScreen.hoverOrders();
		landingScreen.clickPlaceOrders();
		OrderFormScreen orderFormScreen = new OrderFormScreen();
		orderFormScreen.selectCustomer(BlackBuckResources.CUSTOMER);
		orderFormScreen.enterStartLocation(BlackBuckResources.START_LOCATION);
		orderFormScreen.enterEndLocation(BlackBuckResources.END_LOCATION);
		orderFormScreen.selectProduct(BlackBuckResources.PRODUCT_TYPE_SUGAR);
		orderFormScreen.selectTruckType(BlackBuckResources.TRUCK_TYPE_16T15T);
		orderFormScreen.enterShipmentDate(BlackBuckResources.ORDER_SHIPMENT_DATE);
		orderFormScreen.checkOptimizedLoading();
		orderFormScreen.checkManualPlacement();
		orderFormScreen.enterSourceEmail(BlackBuckResources.EMAIL);
		orderFormScreen.enterSourceEmailDate(BlackBuckResources.EMAIL_DATE);
		orderFormScreen.enterCustomComments(BlackBuckResources.COMMENT);
		orderFormScreen.clickCreateOrder();
		
		//MODIFY ORDER
		TimeUtils.waitFor(3*1000);
		CreatedOrdersScreen createdOrderScreen = new CreatedOrdersScreen();
		String orderId = createdOrderScreen.getOrderFromOrderTable();
		createdOrderScreen.searchOrder(orderId);
		OrderModificationScreen orderModificationScreen = new OrderModificationScreen();
		orderModificationScreen.selectAction(BlackBuckResources.ACTION_ORDER_PAUSED);
		orderModificationScreen.enterComment(BlackBuckResources.COMMENT);
		orderModificationScreen.clickSubmit();
	}
	

}
