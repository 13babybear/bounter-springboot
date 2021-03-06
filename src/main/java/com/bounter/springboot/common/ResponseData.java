package com.bounter.springboot.common;

/**
 * 封装请求返回的json数据
 * @author simon
 *
 * @param <T>
 */
public class ResponseData<T> {
	
	//请求成功失败的标志
	private boolean success;
	
	//成功时返回的数据，可以不传
    private T data;

    //请求出错时的错误信息
    private String errorMsg;
    
    //10位的时间戳
    private final long timestamp = System.currentTimeMillis() / 1000;
    
    //返回数据的签名
    private String sign;

	public boolean isSuccess() {
		return success;
	}

	public T getData() {
		return data;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public ResponseData<T> success() {
		this.success = true;
		return this;
	}
	
	public ResponseData<T> fail() {
		this.success = false;
		return this;
	}
	
	public ResponseData<T> fail(String errorMsg) {
		this.success = false;
		this.errorMsg = errorMsg;
		return this;
	}

	public ResponseData<T> data(T data) {
		this.success = true;
		this.data = data;
		return this;
	}
	
	public ResponseData<T> errorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
		return this;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public String getSign() {
		return sign;
	}

	public ResponseData<T> sign(String sign) {
		this.sign = sign;
		return this;
	}
}
