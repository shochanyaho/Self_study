package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.model.Stamp;

/**
 * データの永続化を行う。
 * 今回はJPAの仕組みを使うのでコンクリートクラスではなく
 * インタフェースを使っている。
 * JpaRepositoryを継承した@Repositoryのインタフェースを作成すると、
 * JPAが自動でコンクリートクラスを作成してくれる。
 */
@Repository
public interface MainRepository extends JpaRepository<Stamp, Long>{

}
