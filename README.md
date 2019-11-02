## 🥳Acmedcare-Applets

Acmedcare+ Tripartite Applet Support Framework

### Architecture

> editing...

### Environment deployment


### Building from Source

You don’t need to build from source to use `Acmedcare+ Applets` (binaries in [repo.acmedcare.com](http://47.97.26.165:8081/repository/maven-public/)), 
but if you want to try out the latest and greatest, 
`Acmedcare+ Applets` can be easily built with the maven wrapper. You also need JDK 1.8.

*First* : git clone source from gitlab
 
```bash
$ git clone http://115.29.47.72:8082/acmedback/Acmedcare-Applets.git
```

*Second* : build

```bash
$ mvn clean install
```

If you want to build with the regular `mvn` command, you will need [Maven v3.5.0 or above](https://maven.apache.org/run-maven/index.html).


### Documents

*First* : add maven dependency
 
```xml

<repositories>
    <repository>
        <id>acmedcare-repo</id>
        <name>Acmedcare+ Maven Repository</name>
        <url>http://47.97.26.165:8081/repository/maven-public/</url>
        <releases>
            <enabled>true</enabled>
        </releases>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>


<dependency>
    <groupId>com.acmedcare.framework</groupId>
    <artifactId>spring-boot-starter-applet</artifactId>
    <version>2.2.0.BUILD-SNAPSHOT</version>
</dependency>

```

*Second* : config applets properties in `application.properties`

```properties

######## global applets config ########
applet.integrate.enabled=true
applet.integrate.supported-applet-types=*
applet.integrate.base-packages=com.acmedcare.framework.applet.integrate.dingtalk.endpoint

applet.integrate.repository.enabled=true
applet.integrate.repository.rdb-config.storage-path=

# default applet config propertiess
applet.integrate.aorp.enabled=false

## Ding talk config properties
applet.integrate.dingtalk.enabled=true
applet.integrate.dingtalk.app-id=27844
applet.integrate.dingtalk.suite-id=6704009
applet.integrate.dingtalk.suite-key=suite4xxxxxxxxxxxxxxx
applet.integrate.dingtalk.suite-secret=_rN_Zd4jydsKN7C2iDFu3ipGX8KygLzdvFlzuATT52jAZe38-G1T8y9CZpEBO0wb
applet.integrate.dingtalk.callback-url-aes-key=4g5j64qlyl3zvetqxz5jiocdr586fn2zvjpa8zls3ij
applet.integrate.dingtalk.callback-url-sign-token=123456

## WeChat Applets Config Properties
applet.integrate.wechat.enabled=true
applet.integrate.wechat.micro-app-config.enabled=true
applet.integrate.wechat.micro-app-config.aes-key=
applet.integrate.wechat.micro-app-config.appid=
applet.integrate.wechat.micro-app-config.msg-data-format=json
applet.integrate.wechat.micro-app-config.secret=
applet.integrate.wechat.micro-app-config.token=

## WeChat MP Config Properties
applet.integrate.wechat.mp-config.enabled=false
applet.integrate.wechat.mp-config.aes-key=
applet.integrate.wechat.mp-config.secret=
applet.integrate.wechat.mp-config.app-id=
applet.integrate.wechat.mp-config.token=

## WeChat Pay Config Properties
applet.integrate.wechat.pay-config.enabled=true
applet.integrate.wechat.pay-config.app-id=
applet.integrate.wechat.pay-config.key-path=
applet.integrate.wechat.pay-config.mch-id=
applet.integrate.wechat.pay-config.mch-key=
applet.integrate.wechat.pay-config.sub-app-id=
applet.integrate.wechat.pay-config.sub-mch-id=


```

### Reference Document

- [Frontend Integrate OpenApi](Applets-OpenApi.md)

### License
 
```
Copyright (c) 2019 Acmedcare+

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```
