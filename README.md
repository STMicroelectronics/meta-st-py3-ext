# meta-st-py3-ext

meta-st-py3-ext is a meta layer for Linux Yocto based distributions running on the STMicroelectronics STM32MP1 architecture, to get started with Python 3 and the Mp1AmpSTSDK (https://github.com/STMicroelectronics/Mp1AmpSTSDK_Python , https://pypi.org/project/mp1ampstsdk/), which make easyer the communication between the A7 and the M4 cores for python developpers (see “meta-meta-st-py3-ext/conf/layer.conf” file for further details on the packages installed). 
The layer includes the stm32_rpmsg_sdb.ko experimental external kernel object, this kernel module, which is the kernel side support for the Mp1AmpSTSDK python3 package, it is not loaded into the kernel tree at boot (see the "insmod" command). The user side APIs counterpart are in the libsdbsdk.so which is part of the Mp1AmpSTSDK python3 package.


The layer meta-st-py3-ext is compiled with the openstlinux-5.10-dunfell-mp1 distribution for the STM32MP157x-DK2 evaluation board. This layer is meant for the "STM32-MP1 Distribution Kit" for more details see the ST wiki https://wiki.st.com/stm32mpu/wiki/STM32MP1_Distribution_Package


## Installation
The meta-st-py3-ext layer can be download to a PC from its GitHub repository.
First, move to the <layers> directory of your distribution, e.g.:
  ```Shell
  $ cd <path-to>/openstlinux-<version>/layers
  ```
Clone the GitHub repository:
  ```Shell
  $ git clone https://github.com/STMicroelectronics/meta-st-py3-ext
  ```
To add this layer to build enter the configuration folder, e.g.:
  ```Shell
  $ cd <path-to>/openstlinux-<version>/build-openstlinuxweston-stm32mp1/conf/
  ```
Copy and paste the following line within the “bblayers.conf” file, just before the “BBLAYERS” token definition, and check that the “BBLAYERS” token contains the “FRAMEWORKLAYERS” token, otherwise add it:
  ```Shell
  $ FRAMEWORKLAYERS += "${@'${OEROOT}/layers/meta-st-py3-ext' if os.path.isfile('${OEROOT}/layers/meta-st-py3-ext/conf/layer.conf') else ''}"
  ```
Or alternatively this layer could be added automatically (after having cloned it) entering the following bitbake command:
  ```Shell
  $ cd <path-to>/openstlinux-<version>/build-openstlinuxweston-stm32mp1
  ```
  ```Shell
  $ bitbake-layers add-layer ../layers/meta-st-py3-ext
  ```
  To check the layer was added succesfully:
  ```Shell
  $ bitbake-layers show-layers
  ```


  
  
You can now build your distribution with BitBake following the wiki instructions https://wiki.st.com/stm32mpu/wiki/STM32MP1_Distribution_Package


## License
COPYRIGHT(c) 2020 STMicroelectronics

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:
  1. Redistributions of source code must retain the above copyright notice,
     this list of conditions and the following disclaimer.
  2. Redistributions in binary form must reproduce the above 
     notice, this list of conditions and the following disclaimer in the
     documentation and/or other materials provided with the distribution.
  3. Neither the name of STMicroelectronics nor the names of its
     contributors may be used to endorse or promote products derived from
     this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
