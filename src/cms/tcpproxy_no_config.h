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

#ifndef TCPPROXY_NO_CONFIG_H
#define TCPPROXY_NO_CONFIG_H

#include "rcs_defs.hh"		/* EXTERN_C_STD_HEADERS */
#include "sokintrf_no_config.h"

#ifdef EXTERN_C_STD_HEADERS
extern "C"
{
#endif

#include <string.h>		/* memset(), strerror() */
#include <errno.h>		/* errno */
#include <signal.h>		// SIGPIPE, signal()
#include <stdlib.h>		// strtol()

#ifdef EXTERN_C_STD_HEADERS
}
#endif




// TCPPROXY_NO_CONFIG_H
#endif
