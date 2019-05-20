package com.mkl.beanannotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value = 3)
@Component
public class BeanImplOne implements BeanInterface { }
