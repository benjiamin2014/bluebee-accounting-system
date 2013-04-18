package com.bluebee.moudle;

import com.bluebee.dao.DailyExpensesDAO;
import com.bluebee.pojo.DailyExpenses;

import java.math.BigDecimal;
import java.util.List;

public abstract interface DailyExpensesMoudle
{
  public abstract void setDailyExpensesDAO(DailyExpensesDAO paramDailyExpensesDAO);

  public abstract void add(DailyExpenses paramDailyExpenses);

  public abstract List getDailyExpensesByTaday();

  public abstract void update(DailyExpenses paramDailyExpenses);

  public abstract void deleteById(String paramString);

  public abstract List getList();

  public abstract int getListSize();

  public abstract List getList(int paramInt1, int paramInt2);

  public abstract int getListSize(String paramString1, String paramString2);

  public abstract List getList(String paramString1, String paramString2, int paramInt1, int paramInt2);

  public abstract List getList(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2);

  public abstract int getListSize(String paramString1, String paramString2, String paramString3, String paramString4);

  public abstract List getList(String paramString1, String paramString2, String paramString3, String paramString4);

  public abstract BigDecimal sumDailyExpensesPay(String paramString);

  public abstract BigDecimal sumDailyExpensesPay(String paramString1, String paramString2, String paramString3);

  public abstract BigDecimal sumDailyExpensesPay(String paramString1, String paramString2, String paramString3, String paramString4);

  public abstract BigDecimal sumDailyExpensesPay(String paramString1, String paramString2);
}