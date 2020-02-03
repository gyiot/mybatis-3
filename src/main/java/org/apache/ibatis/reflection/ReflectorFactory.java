/**
 * Copyright 2009-2015 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ibatis.reflection;

/**
 * 根据class信息，获取到内部封装好的Reflector对象
 */
public interface ReflectorFactory {

  // 是否对已经生成的Reflector进行缓存，默认为true
  boolean isClassCacheEnabled();

  void setClassCacheEnabled(boolean classCacheEnabled);

  Reflector findForClass(Class<?> type);
}
