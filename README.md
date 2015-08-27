# EditText_TextWatcher_Demo
EditText 控件 TextWatcher demo

Demo 主要为了演示监听 EditeText 输入的 TextWatcher类的运行过程。

<img src="img/TextWatcher.gif " alt="img" width=200px/>





TextWatcher 一共用三个方法

    public void beforeTextChanged(CharSequence s, int start, int count, int after)
    
    CharSequence s：输入框原来的字符串
    int start：变化的起点    
    int count：影响了 start 之前的几个字符 
    int after：影响了 start 之后的几个字符
    
    
    public void onTextChanged(CharSequence s, int start, int before, int count)
    CharSequence s：输入框改变后的字符串
    int start：变化的起点
    int before：影响了 start 之前的几个字符 
    int count：影响了 start 之后的几个字符
    
    public void afterTextChanged(Editable s)
    Editable s：改变后的字输入框内容
    
    
关于 count before 和 after 参数

当一直输入时：

    beforeTextChanged：
        count 一直为 0 ，因为每次输入不影响已经输入的内容。
        after 一直为 1 ，代表增加了 1 个长度的输入内容。
    onTextChanged：
        before 一直为 0 ，因为每次输入不影响已经输入的内容。
        count 一直为 1 ，代表增加了 1 个长度的输入内容。
        
当一直删除时：

    beforeTextChanged：
        count 一直为 1 ，代表删除了 1 个长度的内容。
        after 一直为 0 ，代表没有增加内容。
    onTextChanged：
        before 一直为 1 ，代表删除了 1 个长度的内容。
        count 一直为 0 ，代表没有增加内容。
        
当执行 setText() 时：

    beforeTextChanged：
        count 为原来输入的长度。
        after 为新的输入内容长度。
    onTextChanged：
        before 为原来输入长度。
        count 为新的输入内容长度。
    
    
  