/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4823.43e750332 modeling language!*/



// line 33 "model.ump"
// line 52 "model.ump"
public class TerningKopp
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TerningKopp Attributes
  private Terning t1;
  private Terning t2;

  //TerningKopp Associations
  private Spill spill;
  private Terning terning;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TerningKopp(Spill aSpill, Terning aTerning)
  {
    t1 = new Terning();
    t2 = new Terning();
    if (aSpill == null || aSpill.getTerningKopp() != null)
    {
      throw new RuntimeException("Unable to create TerningKopp due to aSpill. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    spill = aSpill;
    boolean didAddTerning = setTerning(aTerning);
    if (!didAddTerning)
    {
      throw new RuntimeException("Unable to create terningKopp due to terning. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  public TerningKopp(Terning aTerning)
  {
    t1 = new Terning();
    t2 = new Terning();
    spill = new Spill(this);
    boolean didAddTerning = setTerning(aTerning);
    if (!didAddTerning)
    {
      throw new RuntimeException("Unable to create terningKopp due to terning. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setT1(Terning aT1)
  {
    boolean wasSet = false;
    t1 = aT1;
    wasSet = true;
    return wasSet;
  }

  public boolean setT2(Terning aT2)
  {
    boolean wasSet = false;
    t2 = aT2;
    wasSet = true;
    return wasSet;
  }

  public Terning getT1()
  {
    return t1;
  }

  public Terning getT2()
  {
    return t2;
  }
  /* Code from template association_GetOne */
  public Spill getSpill()
  {
    return spill;
  }
  /* Code from template association_GetOne */
  public Terning getTerning()
  {
    return terning;
  }
  /* Code from template association_SetOneToAtMostN */
  public boolean setTerning(Terning aTerning)
  {
    boolean wasSet = false;
    //Must provide terning to terningKopp
    if (aTerning == null)
    {
      return wasSet;
    }

    //terning already at maximum (2)
    if (aTerning.numberOfTerningKopps() >= Terning.maximumNumberOfTerningKopps())
    {
      return wasSet;
    }
    
    Terning existingTerning = terning;
    terning = aTerning;
    if (existingTerning != null && !existingTerning.equals(aTerning))
    {
      boolean didRemove = existingTerning.removeTerningKopp(this);
      if (!didRemove)
      {
        terning = existingTerning;
        return wasSet;
      }
    }
    terning.addTerningKopp(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Spill existingSpill = spill;
    spill = null;
    if (existingSpill != null)
    {
      existingSpill.delete();
    }
    Terning placeholderTerning = terning;
    this.terning = null;
    if(placeholderTerning != null)
    {
      placeholderTerning.removeTerningKopp(this);
    }
  }

  // line 39 "model.ump"
   public int trill(){
    return t1.trill() + t2.trill();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "t1" + "=" + (getT1() != null ? !getT1().equals(this)  ? getT1().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "t2" + "=" + (getT2() != null ? !getT2().equals(this)  ? getT2().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "spill = "+(getSpill()!=null?Integer.toHexString(System.identityHashCode(getSpill())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "terning = "+(getTerning()!=null?Integer.toHexString(System.identityHashCode(getTerning())):"null");
  }
}