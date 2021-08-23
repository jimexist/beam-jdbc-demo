package me.jiayu.beamjdbcdemo;

import com.google.auto.value.AutoValue;
import java.io.Serializable;

@AutoValue
abstract class People implements Serializable {

  static People create(int id, String name, int age) {
    return new AutoValue_People(id, name, age);
  }

  abstract int getId();

  abstract String getName();

  abstract int getAge();
}
