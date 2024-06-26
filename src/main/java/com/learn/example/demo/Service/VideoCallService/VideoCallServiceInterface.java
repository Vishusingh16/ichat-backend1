package com.learn.example.demo.Service.VideoCallService;

import com.learn.example.demo.Models.ResponsesModel.CallsResponseModel;
import com.learn.example.demo.Models.ResponsesModel.ResponseModel;
import com.learn.example.demo.Models.VideoCallModels.CallHistory;

import java.util.List;

public interface VideoCallServiceInterface {
    CallsResponseModel startVideoCall(String userId, String receiverId, String authToken, String voiceCall);

    CallsResponseModel endVideoCall(String userId, String receiverId, String authToken);

    List<CallHistory> fetchIncomingCallHistory(String userId, String authToken);

    String formatTime(String time);

    String computeDuration(String startTime, String endTime);

    List<CallHistory> fetchOutgoingCallHistory(String userId, String authToken);

    ResponseModel clearIncomingCallHistory(String id, String authToken);

    ResponseModel clearOutgoingCallHistory(String id, String authToken);

    ResponseModel clearAllHistory(String id, String authToken);

    ResponseModel clearCall(String userId, String callId, String authToken);

    CallsResponseModel answerCall(String receiverId, String roomId, String authToken);
}
