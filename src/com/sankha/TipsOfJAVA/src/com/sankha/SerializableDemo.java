package com.sankha;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

class Address{
	private String address;

	public Address(String address) {
		super();
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
} 

class Address1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Address address;
	

	public Address1(Address address) {
		super();
		this.address = address;
	}

//	public Address1(String address) {
//		super(address);
//		// TODO Auto-generated constructor stub
//	}
	/**
	    * Serialize this instance.
	    * 
	    * @param out Target to which this instance is written.
	    * @throws IOException Thrown if exception occurs during serialization.
	    */
	   private void writeObject(final ObjectOutputStream out) throws IOException
	   {
	      out.writeUTF(this.address.getAddress());
	   }
	 
	   /**
	    * Deserialize this instance from input stream.
	    * 
	    * @param in Input Stream from which this instance is to be deserialized.
	    * @throws IOException Thrown if error occurs in deserialization.
	    * @throws ClassNotFoundException Thrown if expected class is not found.
	    */
	   private void readObject(final ObjectInputStream in) throws IOException, ClassNotFoundException
	   {
	      this.address = new Address(in.readUTF());
	      //super.setAddress((String) in.readObject());
	   }

	   private void readObjectNoData() throws ObjectStreamException
	   {
	      throw new InvalidObjectException("Stream data required");
	   }
	
//	 private void writeObject(ObjectInputStream out) throws IOException {
//		 ((ObjectOutput) out).writeObject(super.getAddress());
//	 }
//	 
//	 private void readObject(ObjectInputStream in) throws IOException {
//		  // not required the default read object
//		  // ----> in.defaultReadObject();
//		  try {
//		   super.setAddress((String) in.readObject());
//		  } catch (ClassNotFoundException e) {
//		   e.printStackTrace();
//		  }
//		 }
}

class Serial implements Serializable{
	private static final long serialVersionUID = 1L;
    static String country = "ITALY";//will not be serialized
    private int age;
    private String name;
    transient int height;////will be hidden so default value will be set
    //private int height;
   // private transient Address1 address;
    private Address1 address;
    
    public Address1 getAddress() {
		return address;
	}

	public void setAddress(Address1 address) {
		this.address = address;
	}

	public Serial(String name) {
    	this.name=name;
    }
    
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		Serial.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Serial [age=" + age + ", name=" + name + ", height=" + height + "]";
	}
    

}


public class SerializableDemo {
	
	public static void main(String[] args) {
		Serial sobj=new Serial("Sankha");
		sobj.setAge(10);
		sobj.setHeight(20);
		sobj.setAddress(new Address1(new Address("ABC SYX")));
		String filename="file.ser";
		
		try {
			    FileOutputStream fo=new FileOutputStream(filename);
			
				ObjectOutputStream obo=new ObjectOutputStream(fo);
			
				obo.writeObject(sobj);
				obo.close();
				fo.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		}
		
		Serial sobj1=null;
		
		System.out.println(" obj erialized Done");
		try {
			FileInputStream fi=new FileInputStream(filename);
			ObjectInputStream obi=new ObjectInputStream(fi);
			sobj1=(Serial) obi.readObject();
			obi.close();
			fi.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		System.out.println(" obj Deserialized "+sobj1);
		
	}

}
