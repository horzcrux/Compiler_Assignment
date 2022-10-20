import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class AST{};

abstract class Command extends AST{
    abstract public void eval(Environment env);
}

class Sequence extends Command{
    List<Command> cmds;
    Sequence(List<Command> cmds){this.cmds=cmds;}
    public void eval(Environment env){
        for(var c:cmds) c.eval(env);
    }
}

class NOP extends Command{
    NOP(){}
    public void eval(Environment env){};
}

class Assignment extends Command{
    String varname;
    Expr e;
    Assignment(String varname, Expr e){ this.varname=varname; this.e=e;}
    public void eval(Environment env){
        env.setVariable(varname,e.eval(env));
    }
}


class Output extends Command{
    Expr e;
    Output(Expr e){ this.e=e;}
    public void eval(Environment env){
        if (e.eval(env)) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}

class Simulate extends Command{
    String

    Simulate(String varname, Expr e){ this.varname=varname; this.e=e;}
    public void eval(Environment env){
        env.setVariable(varname,e.eval(env));
    }

    env.getVariable();
    s.getVariable().size();
    int counter = button.length;
    for(int i = 0; i < counter; i++)
    {
        System.out.println(i);
    }
}

abstract class Expr extends AST{
    abstract public Boolean eval(Environment env);
}

class Latch extends Expr{
    Expr e;
    Latch(Expr e){this.e=e;}
    public Boolean eval(Environment env){
        return e.eval(env);
    };
}

//Command conditons
class Not extends Expr{
    Expr e1;
    Not(Expr e){this.e1=e1;}
    public Boolean eval(Environment env){
        return !e1.eval(env);
    }
}
class Or extends Expr{
    Expr e1, e2;
    Or(Expr e1, Expr e2){this.e1=e1; this.e2=e2;}
    public Boolean eval(Environment env){
        return e1.eval(env) || e2.eval(env);
    }
}
class And extends Expr{
    Expr e1, e2;
    And(Expr e1, Expr e2){this.e1=e1; this.e2=e2;}
    public Boolean eval(Environment env){
        return e1.eval(env) && e2.eval(env);
    };
}


class Constant extends Expr{
    public Integer i;
    Constant(Integer i){ this.i=i;}
    public Integer eval(Environment env){
        return i;
    };
};

class Variable extends Expr{
    public String varname;
    Variable(String varname){this.varname=varname;}
    public Boolean[] eval(Environment env){
        return 	env.getVariable(varname);
    };
};