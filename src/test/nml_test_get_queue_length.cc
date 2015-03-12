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


#include "nml_test_format.hh"

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int 
main(int argc, char **argv)
{
  set_rcs_print_destination(RCS_PRINT_TO_STDERR);

  if(argc < 4)
    {
      fprintf(stderr,"usage : bufname procname configfile queue_length\n");
      exit(255);
    }
  
  NML *nml = new NML(nml_test_format,argv[1],argv[2],argv[3]);
  if(nml == 0)
    {
      exit(255);
    }
  if(!nml->valid())
    {
      fprintf(stderr,"nml->valid() check failed.\n");
      delete nml;
      exit(255);
    }
  int t;
  int queue_length = -1;
  if(argc > 4) {
    queue_length = strtol(argv[4],0,0);
  }
  if((t = nml->get_queue_length()) != queue_length)
    {
      fprintf(stderr,"nml->get_queue_length() returned %d\n", t);
      delete nml;
      exit(255);
    }
  delete nml;
  printf("%d\n",queue_length);
  exit(0);
}
