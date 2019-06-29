package id.co.tutorial.sandbox.springbootsample.repository;

import org.springframework.data.repository.CrudRepository;

import id.co.tutorial.sandbox.springbootsample.entity.Module;

public interface ModuleRepository extends CrudRepository<Module, Long> {

}
