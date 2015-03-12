/* 
The NIST RCS (Real-time Control Systems) 
 library is public domain software, however it is preferred
 that the following disclaimers be attached.

Software Copywrite/Warranty Disclaimer

   This software was developed at the National Institute of Standards and
Technology by employees of the Federal Government in the course of their
official duties. Pursuant to title 17 Section 105 of the United States
Code this software is not subject to copyright protection and is in the
public domain. NIST Real-Time Control System software is an experimental
system. NIST assumes no responsibility whatsoever for its use by other
parties, and makes no guarantees, expressed or implied, about its
quality, reliability, or any other characteristic. We would appreciate
acknowledgement if the software is used. This software can be
redistributed and/or modified freely provided that any derivative works
bear some notice that they are derived from it, and any modified
versions bear some notice that they have been modified.



*/ 

/*
*       New Java File starts here.
*       This file should be named PM_CIRCLE.java
*/


// Set Package Name
package rcs.posemath;

// Import all NML, CMS, and RCS classes and interfaces
import java.io.Serializable;
import rcs.nml.NMLFormatConverter;

/*
*       Class definition for PM_CIRCLE
*       Automatically generated by RCS Java Diagnostics Tool.
*       on Wed Jan 07 10:53:46 EST 1998
*/
public class PM_CIRCLE implements Cloneable, Serializable
{
    public PM_CIRCLE() {
        // override default constructor in for probs with XML endoder
    }
    public PM_CARTESIAN center = new PM_CARTESIAN();
    public PM_CARTESIAN normal = new PM_CARTESIAN();
    public PM_CARTESIAN rTan = new PM_CARTESIAN();
    public PM_CARTESIAN rPerp = new PM_CARTESIAN();
    public PM_CARTESIAN rHelix = new PM_CARTESIAN();
    public double radius = 0;
    public double angle = 0;
    public double spiral = 0;

        public void update(NMLFormatConverter nml_fc)
        {
	    nml_fc.beginClass("PM_CIRCLE",null);
	    nml_fc.beginClassVar("center");
	    center.update(nml_fc);
	    nml_fc.endClassVar("center");
	    nml_fc.beginClassVar("normal");
	    normal.update(nml_fc);
	    nml_fc.endClassVar("normal");
	    nml_fc.beginClassVar("rTan");
	    rTan.update(nml_fc);
	    nml_fc.endClassVar("rTan");
	    nml_fc.beginClassVar("rPerp");
	    rPerp.update(nml_fc);
	    nml_fc.endClassVar("rPerp");
	    nml_fc.beginClassVar("rHelix");
	    rHelix.update(nml_fc);
	    nml_fc.endClassVar("rHelix");
	    radius = nml_fc.update_with_name("radius",radius);
	    angle = nml_fc.update_with_name("angle",angle);
	    spiral = nml_fc.update_with_name("spiral",spiral);
	    nml_fc.endClass("PM_CIRCLE",null);
        }

    /**
     * @return the center
     */
    public PM_CARTESIAN getCenter() {
        return center;
    }

    /**
     * @param center the center to set
     */
    public void setCenter(PM_CARTESIAN center) {
        this.center = center;
    }

    /**
     * @return the normal
     */
    public PM_CARTESIAN getNormal() {
        return normal;
    }

    /**
     * @param normal the normal to set
     */
    public void setNormal(PM_CARTESIAN normal) {
        this.normal = normal;
    }

    /**
     * @return the rTan
     */
    public PM_CARTESIAN getrTan() {
        return rTan;
    }

    /**
     * @param rTan the rTan to set
     */
    public void setrTan(PM_CARTESIAN rTan) {
        this.rTan = rTan;
    }

    /**
     * @return the rPerp
     */
    public PM_CARTESIAN getrPerp() {
        return rPerp;
    }

    /**
     * @param rPerp the rPerp to set
     */
    public void setrPerp(PM_CARTESIAN rPerp) {
        this.rPerp = rPerp;
    }

    /**
     * @return the rHelix
     */
    public PM_CARTESIAN getrHelix() {
        return rHelix;
    }

    /**
     * @param rHelix the rHelix to set
     */
    public void setrHelix(PM_CARTESIAN rHelix) {
        this.rHelix = rHelix;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @return the angle
     */
    public double getAngle() {
        return angle;
    }

    /**
     * @param angle the angle to set
     */
    public void setAngle(double angle) {
        this.angle = angle;
    }

    /**
     * @return the spiral
     */
    public double getSpiral() {
        return spiral;
    }

    /**
     * @param spiral the spiral to set
     */
    public void setSpiral(double spiral) {
        this.spiral = spiral;
    }

    @Override
    public PM_CIRCLE clone() {
        PM_CIRCLE ret = null;
        try {
            ret = (PM_CIRCLE) super.clone();
            if (null != this.center) {
                ret.center = (PM_CARTESIAN) center.clone();
            }
            if (null != this.normal) {
                ret.normal = (PM_CARTESIAN) normal.clone();
            }
            if (null != this.rHelix) {
                ret.rHelix = (PM_CARTESIAN) rHelix.clone();
            }
            if (null != this.rPerp) {
                ret.rPerp = (PM_CARTESIAN) rPerp.clone();
            }
            if (null != this.rTan) {
                ret.rTan = (PM_CARTESIAN) rTan.clone();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

    @Override
    public String toString() {
        return "{angle="+angle+",radius="+radius+",spiral="+spiral+",center="
                +center+",normal="+normal+",rHelix="+rHelix+",rPerp="+rPerp
                +",rTan="+rTan+"}";
    }
}
