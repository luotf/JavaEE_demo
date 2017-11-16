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
> ## 实验一、补充实验1：OGNL表达式使用练习 

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
> ## 实验一、补充实验2：Struts标签库使用练习

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
> ## 实验一、补充实验3：Struts表单标签使用练习
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
> ## 实验二、补充实验4：Struts2输入校验练习
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
