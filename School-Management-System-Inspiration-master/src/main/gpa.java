package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class gpa {
    double first,second,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh,twelveth;
    double total,average,gpa;
    public gpa(double first ,double second ,double third ,double fourth,double fifth,double sixth,double seventh,double eighth,double ninth,double tenth,double eleventh ,double twelveth){
    this.first=first;
    this.second=second;
    this.third=third;
    this.fourth=fourth;
    this.fifth=fifth;
    this.sixth=sixth;
    this.seventh=seventh;
    this.eighth=eighth;
    this.ninth=ninth;
    this.tenth=tenth;
    this.eleventh=eleventh;
    this.twelveth=twelveth;
    
    }
    public double total(){
     this.total=first+second+third+fourth+fifth+sixth+seventh+eighth+ninth+tenth+eleventh+twelveth;
     return total;
    }
    public double average(){
     this.average=(total/1500)*100;
     return average;
    
    }
    public double Gpa(){
     if(first>=90){
     gpa+=0.4;}
     else if(first>=80&&first<90){
     gpa+=3.0;
     }
     else if(first>=70&&first<80){
     gpa+=2.0;
     }
     else if(first>=60&&first<70){
     gpa+=1.0;
     }
     else{
     gpa+=0.0;
     }
      if(second>=90){
     gpa+=0.4;}
     else if(second>=80&&second<90){
     gpa+=3.0;
     }
     else if(second>=70&&second<80){
     gpa+=2.0;
     }
     else if(second>=60&&second<70){
     gpa+=1.0;
     }
     else{
     gpa+=0.0;
     }
     
    
    if(third>=90){
     gpa+=0.4;}
     else if(third>=80&&third<90){
     gpa+=3.0;
     }
     else if(third>=70&&third<80){
     gpa+=2.0;
     }
     else if(third>=60&&third<70){
     gpa+=1.0;
     }
     else{
     gpa+=0.0;
     }
     if(fourth>=90){
     gpa+=0.4;}
     else if(fourth>=80&&fourth<90){
     gpa+=3.0;
     }
     else if(fourth>=70&&fourth<80){
     gpa+=2.0;
     }
     else if(fourth>=60&&fourth<70){
     gpa+=1.0;
     }
     else{
     gpa+=0.0;
     }
      if(fifth>=90){
     gpa+=0.4;}
     else if(fifth>=80&&fifth<90){
     gpa+=3.0;
     }
     else if(fifth>=70&&fifth<80){
     gpa+=2.0;
     }
     else if(fifth>=60&&fifth<70){
     gpa+=1.0;
     }
     else{
     gpa+=0.0;
     }
     if(sixth>=90){
     gpa+=0.4;}
     else if(sixth>=80&&sixth<90){
     gpa+=3.0;
     }
     else if(sixth>=70&&sixth<80){
     gpa+=2.0;
     }
     else if(sixth>=60&&sixth<70){
     gpa+=1.0;
     }
     else{
     gpa+=0.0;
     }
     if(seventh>=90){
     gpa+=0.4;}
     else if(seventh>=80&&seventh<90){
     gpa+=3.0;
     }
     else if(seventh>=70&&seventh<80){
     gpa+=2.0;
     }
     else if(seventh>=60&&seventh<70){
     gpa+=1.0;
     }
     else{
     gpa+=0.0;
     }
     if(eighth>=90){
     gpa+=0.4;}
     else if(eighth>=80&&eighth<90){
     gpa+=3.0;
     }
     else if(eighth>=70&&eighth<80){
     gpa+=2.0;
     }
     else if(eighth>=60&&eighth<70){
     gpa+=1.0;
     }
     else{
     gpa+=0.0;
     }
     if(ninth>=90){
     gpa+=0.4;}
     else if(ninth>=80&&ninth<90){
     gpa+=3.0;
     }
     else if(ninth>=70&&ninth<80){
     gpa+=2.0;
     }
     else if(ninth>=60&&ninth<70){
     gpa+=1.0;
     }
     else{
     gpa+=0.0;
     }
     if(tenth>=90){
     gpa+=0.4;}
     else if(tenth>=80&&tenth<90){
     gpa+=3.0;
     }
     else if(tenth>=70&&tenth<80){
     gpa+=2.0;
     }
     else if(tenth>=60&&tenth<70){
     gpa+=1.0;
     }
     else{
     gpa+=0.0;
     }
      if(eleventh>=90){
     gpa+=0.4;}
     else if(eleventh>=80&&eleventh<90){
     gpa+=3.0;
     }
     else if(eleventh>=70&&eleventh<80){
     gpa+=2.0;
     }
     else if(eleventh>=60&&eleventh<70){
     gpa+=1.0;
     }
     else{
     gpa+=0.0;
     }
       if(twelveth>=90){
     gpa+=0.4;}
     else if(twelveth>=80&&twelveth<90){
     gpa+=3.0;
     }
     else if(twelveth>=70&&twelveth<80){
     gpa+=2.0;
     }
     else if(twelveth>=60&&twelveth<70){
     gpa+=1.0;
     }
     else{
     gpa+=0.0;
     }
     
     gpa=gpa/12;
     return gpa;
}}
