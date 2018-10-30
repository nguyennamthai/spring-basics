package com.whizlabs.spring.basics.spel.evaluation;

import com.whizlabs.spring.basics.spel.evaluation.data.Company;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class EvaluationApp {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        Expression expression1 = parser.parseExpression("'Hello World'");
        System.out.println(expression1.getValue());

        Expression expression2 = parser.parseExpression("T(java.lang.String).join(' ', 'Welcome', 'to', 'Whizlabs')");
        System.out.println(expression2.getValue());

        Company company = new Company("Whizlabs");
        Expression expression3 = parser.parseExpression("name");
        System.out.println(expression3.getValue(company));
    }
}
