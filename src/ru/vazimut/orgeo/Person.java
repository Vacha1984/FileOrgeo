package ru.vazimut.orgeo;

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
  private String status;
  private float summ;

  protected Person (){}

  protected void setGroup (String gr){
      this.group = gr;
  }

  protected void setSurname (String sn){
      this.surname = sn;
  }

  private void  setName (String nm){
      this.name = nm;
  }

  protected void setTeam (String tm){
      this.team = tm;
  }

  protected void setCity (String ct){
      this.city = ct;
  }

  protected void setSportIdent (int si) {
      this.sportIdent = si;
  }

  protected void setStartDays (String sd){
      this.startDays = sd;
  }

  protected void setCoach (String cch){
      this.coach = cch;
  }

  protected void setIdRequest (int idr){
      this.idRequest = idr;
  }

  protected void setStatus (String st){
      this.status = st;
  }

  protected void setSumm (float smm){
      this.summ = smm;
  }

}
