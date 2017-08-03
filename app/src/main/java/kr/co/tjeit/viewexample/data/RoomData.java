package kr.co.tjeit.viewexample.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2017-08-01.
 */

public class RoomData {
    private String roomTitle;
    private int roomDeposit;
    private int roomRentPay;
    private boolean isLikedByUser;  // 좋아요를 했는지
    private String roomType;    // 원룸 / 1.5 / 투룸
    private int stairNum;   // 층수 -1 : 지하, 0 : 반지하
    private double roomSize;    // 몇m^2인지 > 평수 전환
    private int managePay;  // 관리비 5만원 : 50000
    private List<String> hashTags = new ArrayList<String>();

    public RoomData() {
    }

    public RoomData(String roomTitle, int roomDeposit, int roomRentPay) {
        this.roomTitle = roomTitle;
        this.roomDeposit = roomDeposit;
        this.roomRentPay = roomRentPay;
    }

    public RoomData(String roomTitle, int roomDeposit, int roomRentPay, boolean isLikedByUser, String roomType, int stairNum, double roomSize, int managePay) {
        this.roomTitle = roomTitle;
        this.roomDeposit = roomDeposit;
        this.roomRentPay = roomRentPay;
        this.isLikedByUser = isLikedByUser;
        this.roomType = roomType;
        this.stairNum = stairNum;
        this.roomSize = roomSize;
        this.managePay = managePay;
    }

    public boolean isLikedByUser() {
        return isLikedByUser;
    }

    public void setLikedByUser(boolean likedByUser) {
        isLikedByUser = likedByUser;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getStairNum() {
        return stairNum;
    }

    public void setStairNum(int stairNum) {
        this.stairNum = stairNum;
    }

    public double getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(double roomSize) {
        this.roomSize = roomSize;
    }

    public int getManagePay() {
        return managePay;
    }

    public void setManagePay(int managePay) {
        this.managePay = managePay;
    }

    public List<String> getHashTags() {
        return hashTags;
    }

    public void setHashTags(List<String> hashTags) {
        this.hashTags = hashTags;
    }

    public String getRoomTitle() {
        return roomTitle;
    }

    public void setRoomTitle(String roomTitle) {
        this.roomTitle = roomTitle;
    }

    public int getRoomDeposit() {
        return roomDeposit;
    }

    public void setRoomDeposit(int roomDeposit) {
        this.roomDeposit = roomDeposit;
    }

    public int getRoomRentPay() {
        return roomRentPay;
    }

    public void setRoomRentPay(int roomRentPay) {
        this.roomRentPay = roomRentPay;
    }

    @Override
    public String toString() {
        String str = this.roomTitle + " - " + this.roomDeposit + " / " + this.roomRentPay;
        return str;
    }
}
