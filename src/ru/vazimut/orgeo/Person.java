package ru.vazimut.orgeo;

import static java.lang.Boolean.*;

class Person {
  private String group;
  private String surname;
  private String name;
  private String team;
  private String city;
  private int sportIdent;
  private String startDays;
  private String coach;
  private int idRequest;
  private boolean statusPay;
  private float summ;

  protected Person (String group,
          String surname,
          String name,
          String team,
          String city,
          int sportIdent,
          String startDays,
          String coach,
          int idRequest,
          boolean statusPay,
          float summ){
      this.group = group;
      this.surname = surname;
      this.name = name;
      this.team = team;
      this.city = city;
      this.sportIdent = sportIdent;
      this.startDays = startDays;
      this.coach = coach;
      this.idRequest = idRequest;
      this.statusPay = statusPay;
      this.summ = summ;
  }

  protected void setGroup (String gr){
      this.group = gr;
  }

  protected String getGroup (){
        return this.group;
   }
  protected void setSurname (String sn){
      this.surname = sn;
  }

    protected String getSurname (){
        return this.surname;
    }

  protected void  setName (String nm){
      this.name = nm;
  }

    protected String getName (){
        return this.name;
    }

  protected void setTeam (String tm){
      this.team = tm;
  }

    protected String getTeam (){
       return this.team;
    }

  protected void setCity (String ct){
      this.city = ct;
  }

    protected String getCity (){
       return this.city;
    }

  protected void setSportIdent (int si) {
      this.sportIdent = si;
  }

    protected int getSportIdent () {
       return this.sportIdent;
    }

  protected void setStartDays (String sd){
      this.startDays = sd;
  }

    protected String getStartDays (){
        return this.startDays;
    }

  protected void setCoach (String cch){
      this.coach = cch;
  }

    protected String  getCoach (){
       return this.coach;
    }

  protected void setIdRequest (int idr){
      this.idRequest = idr;
  }

    protected int getIdRequest (){
        return this.idRequest;
    }

  protected void setStatusPay (boolean st){
      this.statusPay = st;
  }

    protected boolean getStatusPay (){
       return this.statusPay;
    }

  protected void setSumm (float smm){
      this.summ = smm;
  }

    protected float getSumm (){
       return this.summ;
    }
}
