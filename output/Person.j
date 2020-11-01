.class public Person
.super java/lang/Object
		 
.field name Ljava/lang/String;
.field age Ljava/lang/Integer;
		
.method public <init>()V
.limit stack 128
.limit locals 128
		aload 0
		invokespecial java/lang/Object/<init>()V
		aload 0
		ldc ""
		putfield Person/name Ljava/lang/String;
		aload 0
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield Person/age Ljava/lang/Integer;
		return
.end method
		 
.method public <init>(Ljava/lang/String;Ljava/lang/Integer;)V
.limit stack 128
.limit locals 128
		aload 0
		invokespecial java/lang/Object/<init>()V
		aload 0
		ldc ""
		putfield Person/name Ljava/lang/String;
		aload 0
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield Person/age Ljava/lang/Integer;
		aload 0
		aload 1
		dup_x1
		putfield Person/name Ljava/lang/String;
		pop
		aload 0
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		dup_x1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield Person/age Ljava/lang/Integer;
		pop
		return
.end method
		 
.method public showName()V
.limit stack 128
.limit locals 128
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 0
		getfield Person/name Ljava/lang/String;
		invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "\n"
		invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
		return
.end method
		 
