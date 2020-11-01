.class public Employee
.super Person
		 
.field salary Ljava/lang/Integer;
		
.method public <init>()V
.limit stack 128
.limit locals 128
		aload 0
		invokespecial Person/<init>()V
		aload 0
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield Employee/salary Ljava/lang/Integer;
		return
.end method
		 
.method public <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V
.limit stack 128
.limit locals 128
		aload 0
		invokespecial Person/<init>()V
		aload 0
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield Employee/salary Ljava/lang/Integer;
		aload 0
		aload 1
		dup_x1
		putfield Employee/name Ljava/lang/String;
		pop
		aload 0
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		dup_x1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield Employee/age Ljava/lang/Integer;
		pop
		aload 0
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		dup_x1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield Employee/salary Ljava/lang/Integer;
		pop
		return
.end method
		 
.method public showSalary()V
.limit stack 128
.limit locals 128
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "Salary is:"
		invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 0
		getfield Employee/salary Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/print(I)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "\n"
		invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
		return
.end method
		 
