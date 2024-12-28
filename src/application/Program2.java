package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== TEST 1: Seller findById =====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
//		System.out.println("\n===== TEST 2: Seller findByDepartment =====");
//		Department department = new Department(2, null);
//		List<Seller> list = sellerDao.findByDepartment(department);
//		for(Seller obj : list) {
//			System.out.println(obj);
//		}
//
		System.out.println("\n===== TEST 3: Seller findAll =====");
		List<Department> list = departmentDao.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}
//
		System.out.println("\n===== TEST 4: Seller insert  =====");
		Department newDepartment= new Department(null, "T.I.");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
//		
//		System.out.println("\n===== TEST 5: Seller update =====");
//		seller = sellerDao.findById(1);
//		seller.setName("Martha Waine");
//		sellerDao.update(seller);
//		System.out.println("Update completed!");
//		
//		System.out.println("\n===== TEST 6: Seller delete =====");
//		sellerDao.deleteById(10);
//		System.out.println("Delete completed!");
	}
}
