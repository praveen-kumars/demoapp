package com.fitaexample.demoapp.dto;

import javax.print.DocFlavor.STRING;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Loginrequestdto {
    String username;
    String password;
}
