package org.zq.vo;

public class StatusCode {

    //成功
    public static final int OK=20000;
    public static final String MSGOK="成功";
    //失败
    public static final int ERROR =20001;
    public static final String MSGERROR="失败";
    //用户名或密码错误
    public static final int LOGINERROR =20002;
    public static final String MSGLOGINERROR="用户名或密码错误";
    //权限不足
    public static final int ACCESSERROR =20003;
    public static final String MSGACCESSERROR="权限不足";
    //远程调用失败
    public static final int REMOTEERROR =20004;
    public static final String MSGREMOTEERROR="远程调用失败";
    //重复操作
    public static final int REPERROR =20005;
    public static final String MSGREPERROR ="重复操作";
}
