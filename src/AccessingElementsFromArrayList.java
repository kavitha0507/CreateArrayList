//Accessing Elements from an Array List:


import java.util.ArrayList;

public class AccessingElementsFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> topCompanies = new ArrayList<String>();
        topCompanies.add("Microsoft");
        topCompanies.add("Apple");
        topCompanies.add("Google");
        topCompanies.add("Yahoo");
        topCompanies.add("Amazon");
        //find the size of an Arraylist
        System.out.println("The Top Companies:"+topCompanies.size()+"Companies in the world");
        System.out.println(topCompanies);
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size()-1);
        System.out.println("The Best Company is "+bestCompany);
        System.out.println("The Second Best Company is "+secondBestCompany);
        System.out.println("The Last Company is "+lastCompany);
        //Modify the element at a given index
        topCompanies.set(3,"FaceBook");
        System.out.println("Modified top companies list:" +topCompanies);
    }


}
