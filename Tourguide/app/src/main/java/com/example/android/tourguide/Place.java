package com.example.android.tourguide;

class Place {
    private static final int NULL = -1;
    private String mName;
    private String mDescription;
    private int mImage;
    private String mAdddress;
    private String mPhone;
    private String mWebsite;

    public Place(String name){
        mName = name;
        mDescription=null;
        mImage=NULL;
        mAdddress=null;
        mPhone=null;
        mWebsite=null;
    }

    public Place(String name, String description, int imageResourceId, String address,
                 String phoneNumber, String websiteUrl) {
        mName = name;
        mDescription = description;
        mImage = imageResourceId;
        mAdddress = address;
        mPhone = phoneNumber;
        if (!websiteUrl.startsWith("http://") && !websiteUrl.startsWith("https://"))
            mWebsite="http://"+websiteUrl;
        else mWebsite = websiteUrl;
    }


    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getImageResourceId() {
        return mImage;
    }

    public void setImageResourceId(int imageResourceId) {
        mImage = imageResourceId;
    }

    public boolean hasImage(){
        return mImage!=NULL;
    }

    public String getAddress() {
        return mAdddress;
    }

    public void setAddress(String address) {
        mAdddress = address;
    }

    public String getPhoneNumber() {
        return mPhone;
    }

    public void setPhoneNumber(String phoneNumber) {
        mPhone = phoneNumber;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public void setWebsite(String websiteUrl) {
        mWebsite = websiteUrl;
    }
}