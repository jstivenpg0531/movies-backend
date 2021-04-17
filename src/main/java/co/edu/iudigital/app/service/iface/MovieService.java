package co.edu.iudigital.app.service.iface;

import java.util.List;

import co.edu.iudigital.app.model.entity.Movie;

public interface MovieService {
	
	/**
	 * Obtener todas las peliculas
	 * @return
	 */
	public List<Movie>getAll();
	
	/**
	 * Crea una pelicula
	 * @param movie
	 */
	public void create (Movie movie);	
	/**
	 * Edita una película por su id
	 * @param movie
	 * @param movieId
	 */
	public void edit (Movie movie,int movieId);
	
	/**
	 * Elimia una película por su Id
	 * @param movieId
	 */
	public void delete (int movieId);
	/**
	 * Califica una pelicua
	 * @param movie
	 * @param movieId
	 */
	public void rate(Movie movie,int movieId);
	
}
