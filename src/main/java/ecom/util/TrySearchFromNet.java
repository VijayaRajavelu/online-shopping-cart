package com.ecom.util;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.util.ObjectUtils;

import com.ecom.model.Product;

public class TrySearchFromNet {
	
	//ProductService
	//public List<Product> searchProduct(String name, String category);
	
	
	
//ProductServiceImpl
	
//	// Search products by name
//    public List<Product> searchProductsByName(String name) {
//        return productRepository.findByNameContainingIgnoreCase(name);
//    }
//
//    // Search products by category
//    public List<Product> searchProductsByCategory(String category) {
//        return productRepository.findByCategoryContainingIgnoreCase(category);
//    }
//
//    // Search products by name and category
//    public List<Product> searchProducts(String name, String category) {
//        if (name != null && category != null) {
//            return productRepository.findByNameContainingIgnoreCaseAndCategoryContainingIgnoreCase(name, category);
//        } else if (name != null) {
//            return searchProductsByName(name);
//        } else {
//            return searchProductsByCategory(category);
//        }
//    }
	
	
	
	
	
	
	
//	ProductRepository
	
//	List<Product> findByTitleContainingIgnoreCase(String title);
//
//    List<Product> findByCategoryContainingIgnoreCase(String category);
	
	//List<Product> findByNameContainingIgnoreCaseAndCategoryContainingIgnoreCase(String name, String category);



/*

In this example, we define an endpoint /api/products/search where you can pass name and category as query parameters for filtering the products.

5. Front-End (Optional)
If you have a front-end (e.g., a React, Angular, or Thymeleaf-based UI), you'll want to implement a search interface where users can input search terms. Here's a brief overview of what might happen on the front-end:

Create a search form that allows users to input a product name or category.
When the user submits the form, make an HTTP request (e.g., using Axios or Fetch API) to the /api/products/search endpoint.
Display the search results returned from the server.
Example of search request using JavaScript (for front-end):

javascript
Copy code
function searchProducts() {
    const name = document.getElementById('name').value;
    const category = document.getElementById('category').value;
    
    let url = '/api/products/search?';
    if (name) url += `name=${name}&`;
    if (category) url += `category=${category}&`;
    
    fetch(url)
        .then(response => response.json())
        .then(data => {
            // Display the results in the UI
        });
}
6. Testing
Test the product search functionality:

Make sure that the search results are accurate based on the search criteria (name, category, or both).
Handle cases where no products are found.
Consider pagination if there are large sets of products.
7. Enhancements (Optional)
To improve search functionality, you can:

Use Full-Text Search (e.g., Elasticsearch): For more complex search capabilities (like fuzzy matching, multi-field search, etc.), consider integrating Elasticsearch.
Pagination: For performance and usability, add pagination support to your search endpoint using Spring Data JPA's Pageable interface.
Sorting: Allow users to sort products by price, popularity, etc.
Example of adding pagination:

java
Copy code
public Page<Product> searchProducts(Pageable pageable, String name, String category) {
    if (name != null && category != null) {
        return productRepository.findByNameContainingIgnoreCaseAndCategoryContainingIgnoreCase(name, category, pageable);
    } else if (name != null) {
        return productRepository.findByNameContainingIgnoreCase(name, pageable);
    } else {
        return productRepository.findByCategoryContainingIgnoreCase(category, pageable);
    }
}




@Override
	public Page<Product> getAllActiveProductPagination(Integer pageNo, Integer pageSize, String category) {
		
	    int validPageNumber = pageNo >= 0 ? pageNo : 0;
		int validPageSize = pageSize < 1 ? 1 : pageSize;

		Pageable pageable = PageRequest.of(validPageNumber, validPageSize);
		Page<Product> pageProduct = null;
		
		if(ObjectUtils.isEmpty(category)) {
			pageProduct = productRepository.findByIsActiveTrue(pageable);
		}else {
			pageProduct = productRepository.findByCategory(pageable, category);
		}		
		
		return pageProduct;
	}




Example of Correct Pagination Handling:
Assume that you're creating a pageable object for a paginated query in a Spring service:

java
Copy code
public Page<Product> getProducts(int page, int size) {
    // Ensure the page number is valid (page >= 0)
    int validPageNumber = page >= 0 ? page : 0;
    
    // Ensure the page size is valid (size >= 1)
    int validPageSize = Math.max(1, size);  // Enforce minimum page size of 1

    Pageable pageable = PageRequest.of(validPageNumber, validPageSize);
    
    return productRepository.findAll(pageable);
}
Key Points to Remember:
Page Size ≥ 1: Spring Data JPA requires the page size to be at least 1. If it is 0 or less, an IllegalArgumentException is thrown.
Page Number ≥ 0: Page numbering starts from 0. Make sure the page number is valid (non-negative).
By enforcing a valid page size (greater than or equal to 1) and page number (non-negative), you can prevent the error and ensure proper pagination behavior.

 */

	
	


}
