## 小程序客户端接入接口文档

### 测试环境以及账号

#### 服务器地址

| *服务器类型* | *服务器地址* |
| ----- | :--------: |
| 测试 | `http://47.97.26.165:5543`|
| 正式 | `http://x.x.x.x:5555` |


#### 小程序应用标识`${TYPE}`(重要)

| *key* | *value* |
| ----- | :--------: |
| 微信 | `wechat`|
| 钉钉 | `dingtalk` |



### `小程序客户端`请求接口


- [请求登录接口](#登录授权请求)
- [绑定接口](#账户绑定业务系统接口)
- [解绑接口](#账户解绑业务系统接口)
- [上传文件](#上传文件)

----

#### 登录授权请求
> **POST** - `/applet-endpoints/applet/auth/${TYPE}`   

> 接入钉钉请求参数解析

##### 请求`curl`示例

```sh
curl -X "POST" "http://127.0.0.1:5543/applet-endpoints/applet/auth/dingtalk?corpId=ding2f621e01742628bd35c2f4657eb6378f&authCode=d36131efd0c63c18860272208cb1842f"
```

##### 请求参数信息

- **corpId** 钉钉企业组织ID:

> 示例

```
corpId: ding2f621e01742628bd35c2f4657eb6378f
```
- **authCode** 钉钉授权编码:

> 示例

```
authCode: d36131efd0c63c18860272208cb1842f
```

##### 请求成功返回值

- 成功状态码： `200`

> 成功返回值
```json
{
	"timestamp": "2019-10-21 15:03:53",                     // 时间
	"status": "SUCCESS",                                    // 状态
	"data": {         
		"principal": {                                      // 用户信息（后期根据需求进扩充）
			"basePlatformPrincipalId": null,                // 企业内部基础平台绑定的用户唯一标识
			"unionid": "KeDwVAziiPM4fahfaxPJuaQiEiE",       // 企业内部基础平台绑定的用户唯一标识
			"userid": "280342300093621182",                 // 钉钉平台用户的唯一标识
			"name": "bella",                                // 钉钉平台用户名称
			"avatar": ""                                    // 钉钉平台用户头像
		},
		"corpId": "ding2f621e01742628bd35c2f4657eb6378f",   // 钉钉企业标识
		"userId": "280342300093621182",                     // 钉钉平台用户的唯一标识
		"token": "294f10194f193a1589d222984aff9c10"         // 钉钉平台请求Token
	}
}

```

> 失败返回值

```json
{"timestamp":"2019-10-21 15:20:46","status":"FAILED","message":"不存在的临时授权码"}
```




> 接入微信请求参数解析

> 编辑中


----
#### 账户绑定业务系统接口

> **POST** - `/applet-endpoints/applet/auth/${TYPE}/bind`   


> 接入钉钉请求参数解析

##### 请求`curl`示例

```sh
curl -X "POST" "http://127.0.0.1:5543/applet-endpoints/applet/auth/dingtalk/bind?userId=280342300093621182&baseId=1111&baseToken=1111"
```

##### 请求参数信息

- **userId** 钉钉应用用户ID:

> 示例

```
userId: 280342300093621182
```
- **baseId** 基础平台通行证ID:

> 示例

```
baseId: 123

``````
- **baseToken** 基础平台通行证Token:

> 示例

```
baseToken: eyJhbGciOiJSUzI1NiJ9.eyJfaWQiOiIwNWZjZGY0M2RjMzk0NTU1OGExYjU1ZWYyZjMyNTYxNCIsImRhdCI6Ik4vQmtqTkJBelh0Y04rZDdKRExrVU5OOWNXU2JQWDlId29hV0RYN1B1UElzZ1BSMlNvbS9JK09kWWpWK0hJS0pwWG9ja2Vvb1o3eVZ4a0YydnZweDJtTHA1YVJrOE5FanZrZyszbU8rZXczNmpoaEFkQ1YvVFhhTWNKQ1lqZDhCd1YrMW13T1pVdjJPVzhGZ2tPOERKVmo5bWhKeDMxZ0tIMUdPdmowanA4ST0iLCJpYXQiOjE1NjAyMzQxMzY4MjIsImV4cCI6MTU2MDg0MDE4MTgyMiwiYXVkIjpudWxsfQ.gMJO1D_qDrEOqty4lo1DrwdtZOslJiAUhATijMO6Tu8z8XYE7w6ehx0oF6IkRnYkV4LpvWZsFrex-DKTxx5MzbegyKcZdjp6_QqIkxyQkuiFY3aqIzBZ4Nz2h6nyAQxTmfgAZjOI_J78O73JP93NbsGrDkFYKLSyfyBhnZqRqIArCFJfRWVYZ5S72Lq3DNXv87HLi5l727oVhnapE3qpCDkXrwTertVf7DZmm0eI-CIwhrCJyBf0tRFENARjOcqCXs1AVSpd9MsX47l7UkipHsNdl6qVA9F7V1cRmbUm7oOOSGOOMfmYpfM0Gg6aWoBmttXhrAolGkIFcoFGzp2dyA
```

##### 请求成功返回值

- 成功状态码： `200`

> 成功返回值
```json
{
	"timestamp": "2019-10-21 15:03:53",                     // 时间
	"status": "SUCCESS"                                     // 状态
}

```

> 失败返回值

```json
{"timestamp":"2019-10-22 10:19:03","status":"FAILED","message":"用户在钉钉应用平台还未授权"}
```

> 接入微信请求参数解析

> 编辑中


----

#### 账户解绑业务系统接口
> **POST** - `/applet-endpoints/applet/auth/${TYPE}/unbind`   

> 接入钉钉请求参数解析

##### 请求`curl`示例

```sh
curl -X "POST" "http://127.0.0.1:5543/applet-endpoints/applet/auth/dingtalk/unbind?userId=280342300093621182&baseId=1111"
```

##### 请求参数信息

- **userId** 钉钉应用用户ID:

> 示例

```
userId: 280342300093621182
```
- **baseId** 基础平台通行证ID:

> 示例

```
baseId: 123

``````

##### 请求成功返回值

- 成功状态码： `200`

> 成功返回值
```json
{
	"timestamp": "2019-10-21 15:03:53",                     // 时间
	"status": "SUCCESS"                                     // 状态
}

```

> 失败返回值

```json
{"timestamp":"2019-10-22 10:19:03","status":"FAILED","message":"用户在钉钉应用平台还未授权"}
```

> 接入微信请求参数解析

> 编辑中


-----


#### 上传文件

##### 请求`curl`示例

```bash

curl -F file=@/Users/misselvexu/Downloads/iPhone-11-Pro-stock-blue-wallpaper-by-AR72014.png http://127.0.0.1:5543/applet-endpoints/applet/nas/upload

```

## Http Javascript客户端使用

> 基于标准的 `multipart/form-data` 表单上传方式

----

> Request

```
URL:      http://127.0.0.1:5543/applet-endpoints/applet/nas/upload
Method:   POST 
```

> Response

- 成功
> 状态码: 200

> 返回值:

```json

{
	"timestamp": "2019-11-02 13:10:05",
	"status": "SUCCESS",
	"data": {
		"fileKey": "011005-1Zf0fKk_yJANQwatJqxu3xjZO6J",
		"fileSize": 315114,
		"mediaType": "image/png",
		"filePublishUrl": "http://127.0.0.1:5543/applet-endpoints/applet/nas/d/011005-1Zf0fKk_yJANQwatJqxu3xjZO6J",
		"fileChecksum": "0e00663b90bb8d1333e57e611a71f83c"
	}
}

```

#### 常量表
