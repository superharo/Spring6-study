/**
 * Spring将采用和ApplicationContext相同的策略来访问资源。也就是说，
 * 如果ApplicationContext是FileSystemXmlApplicationContext，res就是FileSystemResource实例；
 * 如果ApplicationContext是ClassPathXmlApplicationContext，res就是ClassPathResource实例
 *
 * 当Spring应用需要进行资源访问时，实际上并不需要直接使用Resource实现类，而是调用ResourceLoader实例的getResource()方法来获得资源，ReosurceLoader将会负责选择Reosurce实现类，也就是确定具体的资源访问策略，从而将应用程序和具体的资源访问策略分离开来
 */
package online.superh.resoucreLoader;