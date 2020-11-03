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
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 3
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 7
		aload 7
		ldc ""
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 7
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		astore 4
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 7
		aload 7
		ldc ""
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 7
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		astore 5
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 7
		aload 7
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 8
		aload 8
		ldc ""
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 8
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 8
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 8
		aload 8
		ldc ""
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 8
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 8
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 8
		aload 8
		ldc ""
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 8
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 8
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 8
		aload 8
		ldc ""
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 8
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 8
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 7
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		astore 6
		new List
		dup
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 7
		aload 7
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 8
		aload 8
		ldc "Doughnut"
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 8
		ldc 5000
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 8
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 8
		aload 8
		ldc "Croissant"
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 8
		ldc 4000
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 8
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 8
		aload 8
		ldc "Cookies"
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 8
		ldc 2000
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 8
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 8
		aload 8
		ldc "Chocolate Cake"
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 8
		ldc 8000
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 8
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 7
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokespecial List/<init>(LList;)V
		dup
		astore 6
		pop
		new Cart
		dup
		invokespecial Cart/<init>()V
		dup
		astore 1
		pop
		ldc 0
		dup
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		pop
	Label_6:
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		ldc 4
		if_icmpge Label_9
		ldc 1
		goto Label_10
		Label_9:
		ldc 0
		Label_10:
		ifeq Label_7
		new List
		dup
		aload 6
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast List
		invokespecial List/<init>(LList;)V
		dup
		astore 5
		pop
		new List
		dup
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 7
		aload 7
		aload 5
		ldc 0
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast java/lang/String
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		aload 5
		ldc 1
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 7
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		invokespecial List/<init>(LList;)V
		dup
		astore 4
		pop
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 7
		aload 7
		aload 4
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new Fptr
		dup
		aload 1
		ldc "addToCart"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		aload 7
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
	Label_8:
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		iadd
		dup
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		pop
		goto Label_6
	Label_7:
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 7
		new Fptr
		dup
		aload 1
		ldc "getSum"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		aload 7
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		dup
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 3
		pop
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/print(I)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "\n"
		invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
		return
.end method
		 
