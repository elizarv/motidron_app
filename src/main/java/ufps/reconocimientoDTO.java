package ufps;

public class reconocimientoDTO {
	
	private int id;
	private String src;
	private float latitud;
	private float longitud;
	private String api_cloud;
	private String msg;
	
	public reconocimientoDTO() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public float getLatitud() {
		return latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public String getApi_cloud() {
		return api_cloud;
	}

	public void setApi_cloud(String api_cloud) {
		this.api_cloud = api_cloud;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	

}
