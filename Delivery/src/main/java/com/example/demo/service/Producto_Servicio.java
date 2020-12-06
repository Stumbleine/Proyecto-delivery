package com.example.demo.service;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.document.Producto;
import com.example.demo.repository.Producto_repositorio;

import ch.qos.logback.core.subst.Token.Type;


@Service
public class Producto_Servicio {
	@Autowired
	private Producto_repositorio repo_produc;
	public String guardar_producto(String nombre,String tamano,String tipo,double precio, MultipartFile file) throws IOException {
        Producto producto = new Producto(nombre,tamano,tipo,precio);
        String extencion=extencion(file.getOriginalFilename());
        producto.setImage(new Binary(BsonBinarySubType.BINARY, file.getBytes()));
        producto = repo_produc.save(producto);
        System.out.println("-------------->"+producto.getId().toString());
        return producto.getNombre();
    }
	
	public Optional<Producto> eliminar_producto(String id) {
		
		Optional<Producto> producto=repo_produc.findById(id);
		repo_produc.deleteById(id);
		return producto;
	}
	
	public void lista_de_productos( List<Producto> lista){
		 lista=(ArrayList<Producto>) repo_produc.findAll();
		 
	}	
	public void actualizar_producto(String id,String nombre,String tamano,String tipo,int precio, MultipartFile file) {
		Optional<Producto> producto_en_la_base=repo_produc.findById(id);
		producto_en_la_base.get().setNombre(nombre);
		producto_en_la_base.get().setTamano(tamano);
		producto_en_la_base.get().setTipo(tipo);
		producto_en_la_base.get().setPrecio(precio);
		try {
			producto_en_la_base.get().setImage(new Binary(BsonBinarySubType.BINARY, file.getBytes()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    repo_produc.save(producto_en_la_base.get());
		
	}
	
	public String extencion(String cad) {
		String res="";
		for(int i=cad.length()-1;i>0;i--) {
			if(cad.charAt(i)!='.') {
				res=cad.charAt(i)+res;
			}
			else {
				break;
			}
		}
		
		return res;
	}
	public Producto buscar_producto(String id) {
		Optional<Producto> producto=repo_produc.findById(id);
		return producto.get();
	}
}
