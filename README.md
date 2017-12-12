# JavaEE_demo
JavaEE课堂小demo
> ### 实验一、Action的实现与配置([actionApp2](https://github.com/luotf/JavaEE_demo/tree/master/actionApp2))
```
1. 分别创建名为actionApp1和actionApp2的web应用。两个web应用中都包含以下三个jsp页面：
   * login.jsp：用户登录页面，设为web应用的首页。页面中应该包括用户名和密码的输入框以及登录和注册按钮。
   * welcome.jsp：登录成功页面。页面中要包括“欢迎你，xxx”、“服务器处理结果：msg”（Action中封装的处理结果信息）和“服务器访问次数：n”这三行信息，其中，    xxx为访问者在login页面提交的用户名， msg为服务器在判断用户名和密码一致后返回的信息（例如“登录成功”）或者为用户注册成功后返回的信息（例如“注册成功”），n为服务器访问次数的值。
   * error.jsp：登录失败页面。页面中要包括“服务器处理结果：msg”，其中msg为服务器在判断用户名和密码不一致后返回的信息（例如“用户名与密码不一致”）。
2. 对actionApp1的要求：
   * 实现名为Login.Action和Regist.Action的Action类。
   * 在struts.xml文件的Action的配置中使用通配符。
   * 使用ActionContext类实现服务器计数器功能。
3. 对actionApp2的要求：
   * 实现名为LoginRegistAction的Action类。
   * 在struts.xml文件的Action的配置中使用method属性。
   * 使用ActionContext类实现服务器计数器功能。
  ```
> ## 补充实验1：OGNL表达式使用练习 

```
1. 新建名为ognlApp的web应用。创建student类，student类中应有学号、姓名、性别、年龄和籍贯等属性。
   为名为ognl的action创建处理类ognlTestAction，在该类中添加student集合，数据如下。
   
   学号	 姓名	 性别	年龄	籍贯
   0901	 张驰	 男	 21	北京
   0902	 李伟	 男	 20	四川
   0903	 王可	 女	 18	广东
   0904	 赵冰	 女	 19	四川
   0905	 谢玫	 女	 21	湖南
   0906	 胡新	 男	 19	四川

2. 要求在index.jsp页面中显示以下内容：获取籍贯是四川的所有学生姓名；获取年龄小于20的第一个学生的姓名；获取最后一个女同学的姓名；
   获取所有年龄为18的学生籍贯；获取名为“李四”的学生的学号。
3. 访问静态成员：要求在index.jsp页面中显示出java.long.Math中的E值；要求在index.jsp页面中显示出系统环境变量“classpath”的值。
 ```
> ## 补充实验2：Struts标签库使用练习

```
新建名为tagsApp的web project。要求实现以下内容：
1. 创建Person类，该类中包含有属性：name(String), birthday(Date)。
2. 在index.jsp中使用bean标签。在bean标签中使用param子标签输入Person实例的属性值：name为tom，birthday为1999-6-1。
   在bean标签体外使用property标签输出该实例的name属性，使用date标签以“yyyy年mm月dd日”的格式输出birthday属性。
3. 创建TagsAction，该类中包含结果参数age，将Person类中的birthday属性值与当前日期的差值作为age的值。
4. 编辑配置文件struts.xml，将TagsAction类作为名为tag的Action的处理类，返回结果为success时对应的逻辑视图是success.jsp。
5. 在index.jsp中使用名为tag的action，并将其处理结果返回页面包含在本页中。
6. 创建success.jsp。在该页中输出action的结果参数age的内容。
7. 在index.jsp中使用url标签输出带参数的url，参数名为id，参数值为101。
```
> ## 补充实验3：Struts表单标签使用练习
```
新建名为formTagsApp的web project。要求实现以下内容：
1. 创建index.jsp页面。在该页面中使用doubleselect标签生成一个级联列表框，级联列表中的数据来源map集合：
   {'四川':{'成都','广元','西昌'},'江苏':{'南京','无锡','苏州'},'安徽':{'合肥','六安','芜湖'}}，级联列表的label标签为“请选择城市”。
    (注意：该标签应该放置在一个form标签内，并添加一个提交按钮)
2. 创建result.jsp页面。在该页面中显示用户选择的城市。
3. 创建Book类，该类中包含有属性：name(String),author(String)。
4. 创建BookList类，该类中包含有属性：books(List<Book>)。具体数据请自行编写。
5. 编辑index.jsp页面。在该页面中使用radio标签生成多个单选按钮。label标签为“请选择图书”。
   list属性为BookList类中books属性，listKey为author，listValue为name。
6. 编辑result.jsp页面。在该页面中显示用户所选图书的作者。
7. 创建名为FormTagsAction的action类以完成上述工作，并在struts.xml文件中进行相应的配置。
```
> ## 实验二、Struts2类型转换练习
```
新建名为converterApp的web project，该应用允许用户输入一个或多个ISBN编码，要求使用自定义类型转换器将用户输入的字符串数组转换成ISBN类型。
1. 创建Isbn.java类，该类中包含五个字符串属性，分别为图书、国家和语言、出版社、书序码、校验码。（关于13位的ISBN编码构成请看：参考资料）
2. 创建input.jsp页面，该页面中包含一个表单，表单内有一个文本输入框，一个提交按钮。文本输入框用于用户输入一个ISBN编码，例如978-7-121-09727-0。
3. 创建ConverterAction.java用以对input.jsp页面进行业务逻辑的处理。
4. 创建show.jsp页面，输出类型转换后的ISBN编码。
5. 创建IsbnConverter.java,在该类中实现类型转换。要求使用全局类型转换器对该类型转换进行注册。
6. 创建input2.jsp页面，该页面中包含一个表单，表单内有三个文本输入框，一个提交按钮。文本输入框用于用户输入三个ISBN编码。
7. 创建Converter2Action.java用以对input2.jsp页面进行业务逻辑的处理。
8. 创建show2.jsp页面，输出类型转换后的三个ISBN编码。
9. 创建IsbnArrayConverter.java,在该类中实现类型转换。要求使用局部类型转换器对该类型转换进行注册。
注：
   【校验码的计算方法如下】：
   假设某国际标准书号号码前12位是：978-986-181-728;
   计算加权和S：
   S = (9x1)+(7x3)+(8x1)+(9x3)+(8x1)+(6x3)+(1x1)+(8x3)+(1x1)+(7x3)+(2x1)+(8x3) = 164；
   计算S÷10的余数M：M = 164 mod 10 = 4；
   计算10 - M 的差N：N = 10 − 4 = 6;
   如果N = 10，校验码是数字“0”；
   如果N为其他数字，校验码是数字N。;
   所以，该书的校验码是6。完整的国际标准书号号码为 ISBN 978-986-181-728-6
```
> ## 补充实验4：Struts2输入校验练习
```
新建名为validationApp的web project，该应用允许用户输入一本图书的相关信息，要求对表单中的每个文件输入框进行输入校验。
1. 创建input.jsp页面，该页面用于输入图书的以下信息：
   字段          名字段类型     校验规则
   书名           String       必须输入；长度在4-80之间
   作者           String       必须输入；长度在4-40之间
   书号(13位ISBN) String       必须输入；长度必须是13位；根据参考资料中的ISBN校验码的计算方法对书号的有效性进行校验。
   出版社         String       文本中必须包含“出版社”一词
   出版日期        Date         日期范围为1900年1月1日到当前日期
   价格            Double       最小值为0.0
   库存数量        Integer 最小值为0
2.创建show.jsp页面，该页面用于显示用户输入的图书的所有信息。
3. 创建名为BookAction的Action类，用以对请求参数进行处理。
4. 要求使用Struts2的内建校验器校验“书名”、“作者”、“出版日期”、“价格”和“库存数量”字段；要求手动编写代码校验“书号”的有效性；
   要求手动编写代码校验“出版社”字段中是否包含了“出版社”三个字。
```
> ## 补充实验5：Struts2国际化应用实现
```
新建名为i18nApp的web project，该应用实现了一个简单的邮件订阅系统。具体要求如下：
1. 创建subscribe.jsp页面，该页面中包含一个表单，表单内有一个文本输入框，一个提交按钮。文本输入框用于用户输入邮箱地址。
2. 创建success.jsp页面，输出action的处理结果和订阅成功的国际化信息。
3. 创建error.jsp页面，输出action的处理结果和订阅失败的国际化信息。
4. 创建基名为mess的全局资源包系统，包括中国大陆地区的中文资源包，中国香港地区的中文资源包。该资源包中包含名为subscribePage，successPage，errorPage三个键，分别用于设置subscribe.jsp、success.jsp、error.jsp三个网页标题的国际化信息。
提示：中国香港地区使用繁体中文。获取繁体中文的简单方法：打开word，输入简体中文内容。选中要转换的文本，点击word菜单【审阅】中的【简转繁】即可获取相应的繁体内容。
5. 创建SubscribeAction业务逻辑，对用户输入的格式作一个简单的格式判断，如果用户输入的内容中有@符号，则认为格式正确，订阅成功；反之，如果不存在@符号，则邮箱地址无效，订阅失败。另外，在该action类中封装一个字符串型的处理结果msg，msg中的内容通过访问全局资源包中的result键来设置，该键的内容比如是“订阅结果”。
6. 为SubscribeAction类创建相应的中国中文资源包和香港中文资源包。具体内容如下：
  (1) subscribe.jsp页面中的文本输入框所需的国际化信息对应该资源包系列中的email键（例如：email=邮箱地址），subscribe.jsp页面中的提交按钮所需要的国际化信息对应该资源包系列中的submit键；
  (2) success.jsp页面中的订阅成功的国际化信息对应该资源包系列中的success键，该消息要求使用两个占位符，第一个占位符用于获取用户输入的邮箱，第二个占位符用于获取当前时间，例如：“邮箱地址abc@edf.com订阅成功，订阅时间是2011年11月3日“；
  (3) error.jsp页面中的访问失败的国际化信息对应于资源包中的error键，该消息要求使用ognl表达式添加一个参数，这个参数是用户输入的邮箱地址，例如：“123.com邮箱地址无效，订阅失败。”
  (4) 选作内容：在设置success键和error键时可以通过getText()方法获取同一资源包中的email键的内容，当email键的内容有变化时，success键和error键也会同步更新。
7. 修改浏览器的语言进行测试。
```
> ## 实验三、实现Struts2自定义拦截器
```
新建名为intercepterApp的web project，该应用使用拦截器实现访问者的访问权限控制。
1. 创建login.jsp页面，该页面中包含一个表单，表单中有两个文本输入框，分别用于输入用户名和密码。表单的action属性为login。
2. 创建succ.jsp页面，用于输出用户登录成功的信息。
3. 创建error.jsp页面，用于输出用户登录失败的信息。
4. 创建LoginAction类，该类用于处理用户的登录请求，是login的实现类。判断当用户名和密码都为“admin”时方可登录成功，并将用户名保存在session中。
5. 在struts.xml文件中配置名为login的Action。
6. 创建名为AuthorityInterceptor的自定义拦截器类，获取session中的用户名，若用户名不是“admin”，则返回login.jsp页面。
7. 创建index.jsp页面，该页面中仅包含文本“welcome”。
8. 定义并配置自定义拦截器，使得只有名为admin的登录用户可以访问当前这个web应用中的所有页面，其他访问者（包括未登录用户和用户名不是admin的用户）则无权访问。
9. 在浏览器地址栏中输入：http://localhost:8088/interceptorApp/index.action，检查自定义拦截器是否起效。正确情况下，若用户未登录或登录用户名不是admin，则返回login.jsp页面提示用户使用admin用户名登录；若用户使用admin登录成功，则返回到index.jsp页面。
```
> ## 实验四、使用Struts2控制文件的上传与下载
```
新建名为fileUpDownApp的web project，该应用使用struts2控制文件的上传与下载。
1. 创建upload.jsp为文件上传页面，上传主题为个人资料的上传。该页面的表单中包含一个用于输入用户名的文本输入框，一个用于选择专业的下拉列表，一个用于选择年级的下拉列表，一个用于上传头像的文件标签，一个用于上传个人简历的文件标签，该表单的action属性为“upload”。要求对该表单中的用户输入进行验证。要求使用校验规则文件为用户名字段进行校验，用户名必须输入并且用户名长度限制在4到20个字符之间。要求手动实现头像上传和个人简历上传的输入验证，头像必须为gif或jpeg类型且小于50k的图像文件，个人简历必须为doc类型且小于2M的文本文件。
2. 创建UploadAction.java，该类为名为upload的action的实现类。该类实现文件上传和过滤的业务逻辑。
3. 创建success.jsp页面，该页面用于显示上传结果，包括用户输入的用户名、头像以及个人简历。头像以图片形式显示，个人简历以超链接的形式显示。
4. 创建download.jsp为文件下载页面，下载主题为课程表。该页面的表单中包含两个下拉列表标签，分别用于选择专业和年级。该表单的action属性设为“download”。
5. 创建DownloadAction.java，该类为名为download的action的实现类。根据选择的专业和年级，生成要下载的文件名，实现下载。注意：专业为中文，因此生成的文件名要求包含中文。
6. 要求使用拦截器限制下载，只允许登录用户下载。
7. 在struts.xml文件中对上述action进行配置。注意struts常量的配置。
8. 要求该应用实现国际化，包括输出的错误信息。
```
> ## 实验五、Spring设值注入
```
新建名为SpringDITest的web project，该应用使用struts2与spring整合，完成用户数据的存储功能。
1. 创建org.vo.User简单类，包括name与pwd两个字段； 
2. 创建org.service.UserService接口，包含一个save(User user)方法；
3. 创建org.serviceimpl.UserServiceImpl类，实现UserService接口，实现save(User user)方法的功能（可以简单给出一个输出语句）；
4. 创建org.action.SaveAction类，要求在该action类中实现自动注入UserServiceImpl类对象，完成对页面传入的用户数据进行存储；
5. 创建save.jsp页面，提供录入用户数据的界面，提交后，可请求SaveAction进行存储处理；
6. 创建save_success.jsp页面，SaveAction返回“success”时跳转，显示用户存储成功的提示信息。
7. 创建spring的配置文件applicationContext.xml，指定放在WEB-INF目录中；创建struts.properties文件，设置spring自动装配。
```
