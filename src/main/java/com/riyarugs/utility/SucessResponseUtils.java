package com.riyarugs.utility;

import com.riyarugs.response.SuccessResponse;

public class SucessResponseUtils {
	public static SuccessResponse createSuccessObject(int statusCode, String messsage) {
    	SuccessResponse successResponse = new SuccessResponse();
    	successResponse.setMessage(messsage);
    	successResponse.setStatusCode(statusCode);
        return successResponse;
    }

}
