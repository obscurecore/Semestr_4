package exceptions_handling;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
/*
@ControllerAdvice
public class ExceptionHandlerController {
  
  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Some exception text")
  @ExceptionHandler(SomeException0.class)
  public void standard() {}

  @ExceptionHandler({SomeException1.class, SomeException2.class})
  public String simpleView() {
    return "staticExceptionView";
  }

  @ExceptionHandler(NotFoundException3.class)
  public ModelAndView informedView(HttpServletRequest req, Exception exception) {
    ModelAndView mav = new ModelAndView();
    mav.addObject("exception", exception);
    mav.addObject("url", req.getRequestURL());
    mav.setViewName("exceptionViewWithInfo");
    return mav;
  }
}
*/