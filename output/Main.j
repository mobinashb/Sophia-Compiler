.class public Main
.super java/lang/Object
		 
		
.method public static main([Ljava/lang/String;)V
.limit stack 128
.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
.end method
		 
.method public <init>()V
.limit stack 128
.limit locals 128
		aload 0
		invokespecial java/lang/Object/<init>()V
		aconst_null
		astore 1
		aconst_null
		astore 2
		new Employee
		dup
		ldc "Hannah"
		ldc 21
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		ldc 3000
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokespecial Employee/<init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V
		dup
		astore 1
		pop
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 3
		new Fptr
		dup
		aload 1
		ldc "showName"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		aload 3
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 3
		new Fptr
		dup
		aload 1
		ldc "showSalary"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		aload 3
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		new Person
		dup
		ldc "Sophia"
		ldc 30
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokespecial Person/<init>(Ljava/lang/String;Ljava/lang/Integer;)V
		dup
		astore 2
		pop
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 3
		new Fptr
		dup
		aload 2
		ldc "showName"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		aload 3
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		return
.end method
		 
