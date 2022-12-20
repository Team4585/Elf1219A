package frc.robot;

public class Elf1219ATeleopDecisionMaker {
  private Elf1219AJoystick m_TheJoystick = new Elf1219AJoystick();

  private Elf1219AChassis m_Chassis;
  private ToyBag m_ToyBag;



  Elf1219ATeleopDecisionMaker(){

  }

  public void initialize(){
  }

  public void doDecisions(){

    // System.out.println("-- F/B: " + m_TheJoystick.getForwardBackwardValue() + 
    //                    "   S/S: " + m_TheJoystick.getSideToSideValue() + 
    //                    "   Rot: " + m_TheJoystick.getTwistValue());

    m_Chassis.setTargForwardBack(m_TheJoystick.getForwardBackwardValue());
    m_Chassis.setTargSideToSide(m_TheJoystick.getSideToSideValue());
    m_Chassis.setTargRotation(m_TheJoystick.getTwistValue());


  }

  public void setChassis(Elf1219AChassis TheChassis){
    m_Chassis = TheChassis;
  }

  public void setToyBagSubSystem(ToyBag ToyBagSys){
    m_ToyBag = ToyBagSys;
  }


}
