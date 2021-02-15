package com.example.numad20f_huixianzhang;



public class ItemCard implements ItemClickListener {

    private final int imageSource;
    private String itemName;
    private String itemDesc;
    private boolean isChecked;
//    private boolean isClicked;


    //Constructor
    public ItemCard(int imageSource, String itemName, String itemDesc,boolean isChecked) {
        this.imageSource = imageSource;
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.isChecked = isChecked;
    }

    //Getters for the imageSource, itemName and itemDesc
    public int getImageSource() {
        return imageSource;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }



    public boolean getStatus() {
        return isChecked;
    }





    @Override
    public void onItemClick(int position) {
        isChecked = !isChecked;
    }

    @Override
    public void onCheckBoxClick(int position) {
        isChecked = !isChecked;
    }

    @Override
    public void onButtonClick(int position) {
        isChecked = !isChecked;
    }

}