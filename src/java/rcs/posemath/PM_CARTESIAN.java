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
 *       This file should be named PM_CARTESIAN.java
 */
// Set Package Name
package rcs.posemath;

// Import all NML, CMS, and RCS classes and interfaces
import rcs.nml.NMLFormatConverter;

/*
 *       Class definition for PM_CARTESIAN
 *       Automatically generated by RCS Java Diagnostics Tool.
 *       on Wed Jan 07 10:53:44 EST 1998
 */
public class PM_CARTESIAN extends PmCartesian implements Cloneable {

    public void update(NMLFormatConverter nml_fc) {
        super.update(nml_fc);
    }

    public PM_CARTESIAN() {
        super();
    }

    public PM_CARTESIAN add(PM_CARTESIAN c) {
        return new PM_CARTESIAN(x+c.x, y+c.y, z+c.z);
    }

    @Override
    public PM_CARTESIAN multiply(double d) {
        return new PM_CARTESIAN(x*d, y*d, z*d);
    }

    public double distFrom(PM_CARTESIAN p) {
        double dx = (x - p.x);
        double dy = (y - p.y);
        double dz = (z - p.z);
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public double distFromXY(PM_CARTESIAN p) {
        double dx = (x - p.x);
        double dy = (y - p.y);
        return Math.sqrt(dx * dx + dy * dy);
    }

    public PM_CARTESIAN(PmCartesian p) {
        super(p.x, p.y, p.z);
    }

    public PM_CARTESIAN(double startx, double starty, double startz) {
        super(startx, starty, startz);
    }

    public PM_CARTESIAN(PM_CYLINDRICAL c) throws PmException {
        Posemath.pmCylCartConvert(c, this);
    }

     public PM_CARTESIAN subtract(final PmCartesian c) {
        return new PM_CARTESIAN(this.x-c.x,this.y-c.y,this.z-c.z);
    }
    
     public PM_CARTESIAN cross(final PmCartesian other) throws PmException {
        PM_CARTESIAN ret = new PM_CARTESIAN();
        Posemath.pmCartCartCross(this, other, ret);
        return ret;
    }
     
     public PM_CARTESIAN project(PmCartesian other) throws PmException {
        double magv = this.mag();
        if(magv < Posemath.DOUBLE_FUZZ) {
            throw new PmException(Posemath.PM_DIV_ERR, "project of vector with near zero mag() = "+magv);
        }
        return this.multiply(this.dot(other)/(magv*magv));
    }
     
    public PM_CARTESIAN unit() throws PmException {
        final double magv = mag();
        if(magv < Posemath.DOUBLE_FUZZ) {
            throw new PmException(Posemath.PM_DIV_ERR, "unit of vector with near zero mag() = "+magv);
        }
        return multiply(1.0/magv);
    }
    
    public PM_CARTESIAN rotate(PmRotationMatrix mat) throws PmException {
        PM_CARTESIAN ret = new PM_CARTESIAN();
        Posemath.pmMatCartMult(mat, this, ret);
        return ret;
    }
    
    public PM_CARTESIAN rotate(PmQuaternion quat) throws PmException {
        PM_CARTESIAN ret = new PM_CARTESIAN();
        Posemath.pmQuatCartMult(quat, this, ret);
        return ret;
    }
    
    public PM_CARTESIAN rotate(PmRotationVector v) throws PmException {
        PM_CARTESIAN ret = new PM_CARTESIAN();
        Posemath.pmQuatCartMult(Posemath.toQuat(v), this, ret);
        return ret;
    }
    
    @Override
    public PM_CARTESIAN clone() {
        PM_CARTESIAN cloned_object = null;
        try {
            cloned_object = (PM_CARTESIAN) super.clone();
        } catch (Exception e) {
        }
        return cloned_object;
    }

    static public PM_CARTESIAN valueOf(String s) {
        return new PM_CARTESIAN(PmCartesian.valueOf(s));
    }
}
