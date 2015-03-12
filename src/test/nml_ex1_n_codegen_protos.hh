/*
*	New C++ Header  File starts here.
*	This file should be named nml_ex1_n_codegen_protos.hh
*	Automatically generated by NML CodeGen Java Applet.
*	with command line arguments :  generate_symbol_lookups=true HHFile=nml_ex1.hh
*
*	.gen script :
*		0:load nml_ex1.hh
*		1:clear
*		2:select_from_file nml_ex1.hh
*		3:generate C++ protos>nml_ex1_n_codegen_protos.hh
*		4:generate C++ format>nml_ex1_n.cc
*		5:generate C++ update>nml_ex1_n.cc
*		6:generate C++ constructor>nml_ex1_n.cc
*		7:exit
*
*/

#ifndef nml_ex1_n_codegen_protos_hh_included
#define nml_ex1_n_codegen_protos_hh_included

// Include all NML, CMS, and RCS classes and functions
#include "rcs.hh"

// Include command and status message definitions
#include "nml_ex1.hh"

// Forward Function Prototypes


#ifndef MAX_EX_NAME_LENGTH
#define MAX_EX_NAME_LENGTH 12
#endif
#ifndef EX_NAME_LIST_LENGTH
#define EX_NAME_LIST_LENGTH 2
#endif


/* This list must be in alphabetical order and the three lists must correspond. */
extern const NMLTYPE ex_id_list[EX_NAME_LIST_LENGTH];
extern const size_t ex_size_list[EX_NAME_LIST_LENGTH];
extern const char ex_name_list[EX_NAME_LIST_LENGTH][MAX_EX_NAME_LENGTH];
extern const char *ex_symbol_lookup(long type);


// Enumerated Type Constants

extern int ex_format(NMLTYPE type, void *buffer, CMS *cms);

#endif
	/* # endif nml_ex1_n_codegen_protos_hh_included */ 

