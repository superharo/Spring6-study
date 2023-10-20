/**
 *具体的生命周期过程**
 * - bean对象创建（调用无参构造器）
 * - 给bean对象设置属性
 * - bean的后置处理器（初始化之前）
 * - bean对象初始化（需在配置bean时指定初始化方法）
 * - bean的后置处理器（初始化之后）
 * - bean对象就绪可以使用
 * - bean对象销毁（需在配置bean时指定销毁方法）
 * - IOC容器关闭
 */
package online.superh.ioc.xml.lifeCycle;