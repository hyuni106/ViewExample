package kr.co.tjeit.viewexample.data;

/**
 * Created by user on 2017-08-01.
 */

public class PhoneData {
    private String maker;
    private String modelName;

    public PhoneData() {
    }

    public PhoneData(String maker, String modelName) {
        this.maker = maker;
        this.modelName = modelName;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        String str = this.modelName + " / " + this.maker;
        return str;
    }
}
