package com.example.demo1.entity;


import lombok.Data;

import java.math.BigInteger;
import java.util.BitSet;

@Data
public class Student {
    private BigInteger Id;
    private String name;
    private Integer old;
}
