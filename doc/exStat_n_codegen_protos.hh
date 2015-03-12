/*
*	New C++ Header  File starts here.
*	This file should be named exStat_n_codegen_protos.hh
*	Automatically generated by NML CodeGen Java Applet.
*	with command line arguments :  HHFile=exStat.hh
*	RCS_VERSION=@(#) RCS_LIBRARY_VERSION: 2009.01.26_1339 Compiled on Fri Feb  6 08:31:09 EST 2009 for the java platform.
*	$Id: CodeGenCommon.java 1341 2009-02-05 21:22:54Z shackle $
*
*	.gen script :
*		0:load exStat.hh
*		1:clear
*		2:select_from_file exStat.hh
*		3:generate C++ protos>exStat_n_codegen_protos.hh
*
*/

#ifndef exStat_n_codegen_protos_hh_included
#define exStat_n_codegen_protos_hh_included

// Include all NML, CMS, and RCS classes and functions
#include "rcs.hh"

// Include command and status message definitions
#include "exStat.hh"

// Forward Function Prototypes


#ifndef MAX_EXSTAT_NAME_LENGTH
#define MAX_EXSTAT_NAME_LENGTH 10
#endif
#ifndef EXSTAT_NAME_LIST_LENGTH
#define EXSTAT_NAME_LIST_LENGTH 2
#endif


/* This list must be in alphabetical order and the three lists must correspond. */
extern const NMLTYPE exStat_id_list[EXSTAT_NAME_LIST_LENGTH];
extern const size_t exStat_size_list[EXSTAT_NAME_LIST_LENGTH];

// Enumerated Type Constants

extern int exStat_format(NMLTYPE type, void *buffer, CMS *cms);

#endif
	/* # endif exStat_n_codegen_protos_hh_included */ 

